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

import fsb.pfe.project.Model.BoitierExterne;
import fsb.pfe.project.service.BoitierExterneService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BoitierExterneController {

    private BoitierExterneService BoitierExterneService;

    @PostMapping("/addBoitierExterne")
    public BoitierExterne CreateBoitierExterne(@RequestBody BoitierExterne BoitierExterne) {
        return BoitierExterneService.CreateBoitierExterne(BoitierExterne);
    }

    // @PostMapping("/addBoitierExternes")
    // public List<BoitierExterne> CreateBoitierExternes(@RequestBody
    // List<BoitierExterne>
    // BoitierExterne) {
    // return BoitierExterneService.CreateBoitierExternes(BoitierExterne);
    // }

    @GetMapping("/BoitierExternes")
    public List<BoitierExterne> getBoitierExternes() {
        return BoitierExterneService.getBoitierExternes();
    }

    @GetMapping("/BoitierExterne/{idBoitierExterne}")
    public BoitierExterne getBoitierExterneById(@PathVariable Long idBoitierExterne) {
        return BoitierExterneService.getBoitierExterneById(idBoitierExterne);
    }

    // @PutMapping("/updateBoitierExterne")
    // public BoitierExterne UpdateBoitierExterne(@RequestBody BoitierExterne
    // BoitierExterne) {
    // return BoitierExterneService.UpdateBoitierExterne(BoitierExterne);
    // }

    @DeleteMapping("/delete/{idBoitierExterne}")
    public String DeleteBoitierExterne(@PathVariable Long idBoitierExterne) {
        return BoitierExterneService.DeleteBoitierExterne(idBoitierExterne);
    }

}
