package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.SerreCable;
import fsb.pfe.project.service.SerreCableSevice;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SerreCableController {

    private SerreCableSevice SerreCableService;

    @PostMapping("/addSerreCable")
    public SerreCable CreateSerreCable(@RequestBody SerreCable SerreCable) {
        return SerreCableService.CreateSerreCable(SerreCable);
    }

    // @PostMapping("/addSerreCables")
    // public List<SerreCable> CreateSerreCables(@RequestBody List<SerreCable>
    // SerreCable) {
    // return SerreCableService.CreateSerreCables(SerreCable);
    // }

    @GetMapping("/SerreCables")
    public List<SerreCable> getSerreCables() {
        return SerreCableService.getSerreCables();
    }

    @GetMapping("/SerreCable/{idSerreCable}")
    public SerreCable getSerreCableById(@PathVariable Long idSerreCable) {
        return SerreCableService.getSerreCableById(idSerreCable);
    }

    // @PutMapping("/updateSerreCable")
    // public SerreCable UpdateSerreCable(@RequestBody SerreCable SerreCable) {
    // return SerreCableService.UpdateSerreCable(SerreCable);
    // }

    @DeleteMapping("/delete/{idSerreCable}")
    public String DeleteSerreCable(@PathVariable Long idSerreCable) {
        return SerreCableService.DeleteSerreCable(idSerreCable);
    }

}
