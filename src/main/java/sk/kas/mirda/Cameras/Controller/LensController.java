package sk.kas.mirda.Cameras.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/lens")
public class LensController{

    private final List<String> lenses = new ArrayList<>();

    @GetMapping
    public List<String> getAllLenses() {
        return lenses;
    }

    @GetMapping("/show/{id}")
    public String getLensById(@PathVariable int id) {
        return lenses.get(id);
    }

    @PostMapping("/add")
    public void addLens(@RequestBody String lens) {
        lenses.add(lens);
    }

    @PutMapping("/update/{id}")
    public void updateLens(@PathVariable int id, @RequestBody String lens) {
        lenses.set(id, lens);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLens(@PathVariable int id) {
        lenses.remove(id);
    }

}
