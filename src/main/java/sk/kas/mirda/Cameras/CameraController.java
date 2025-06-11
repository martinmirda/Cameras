package sk.kas.mirda.Cameras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.kas.mirda.Cameras.model.Camera;
import sk.kas.mirda.Cameras.model.Lens;
import sk.kas.mirda.Cameras.repository.CameraRepository;
import sk.kas.mirda.Cameras.repository.LensRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cameras")
public class CameraController {
    @Autowired
    private CameraRepository cameraRepository;

    @GetMapping
    public List<Camera> getAllCameras() {
        return cameraRepository.findAll();
    }

    @PostMapping
    public Camera createCamera(@RequestBody Camera camera) {
        return cameraRepository.save(camera);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Camera> updateCamera(@PathVariable Long id, @RequestBody Camera cameraDetails) {
        Optional<Camera> cameraOpt = cameraRepository.findById(id);
        if (cameraOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Camera camera = cameraOpt.get();
        camera.setBrand(cameraDetails.getBrand());
        camera.setModel(cameraDetails.getModel());
        return ResponseEntity.ok(cameraRepository.save(camera));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Camera> getCameraById(@PathVariable Long id) {
        Optional<Camera> cameraOpt = cameraRepository.findById(id);
        return cameraOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCamera(@PathVariable Long id) {
        if (!cameraRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        cameraRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
