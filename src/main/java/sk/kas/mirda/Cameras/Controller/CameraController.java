package sk.kas.mirda.Cameras.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cameras")
public class CameraController {

    private final List<String> cameras = new ArrayList<>();

    @GetMapping
    public List<String> getAllCameras() {
        return cameras;
    }

    @GetMapping("/show/{id}")
    public String getCameraById(@PathVariable int id) {
        return cameras.get(id);
    }

    @PostMapping("/add")
    public void addCamera(@RequestBody String camera) {
        cameras.add(camera);
    }

    @PutMapping("/update/{id}")
    public void updateCamera(@PathVariable int id, @RequestBody String camera) {
        cameras.set(id, camera);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCamera(@PathVariable int id) {
        cameras.remove(id);
    }
}

