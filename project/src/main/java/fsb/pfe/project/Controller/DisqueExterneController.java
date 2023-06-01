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

import fsb.pfe.project.Model.DisqueExterne;
import fsb.pfe.project.service.DisqueExterneService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class DisqueExterneController {

    private DisqueExterneService DisqueExterneService;

    @PostMapping("/addDisqueExterne")
    public DisqueExterne CreateDisqueExterne(@RequestBody DisqueExterne DisqueExterne) {
        return DisqueExterneService.CreateDisqueExterne(DisqueExterne);
    }

    // @PostMapping("/addDisqueExternes")
    // public List<DisqueExterne> CreateDisqueExternes(@RequestBody
    // List<DisqueExterne>
    // DisqueExterne) {
    // return DisqueExterneService.CreateDisqueExternes(DisqueExterne);
    // }

    @GetMapping("/DisqueExternes")
    public List<DisqueExterne> getDisqueExternes() {
        return DisqueExterneService.getDisqueExternes();
    }

    @GetMapping("/DisqueExterne/{idDisqueExterne}")
    public DisqueExterne getDisqueExterneById(@PathVariable Long idDisqueExterne) {
        return DisqueExterneService.getDisqueExterneById(idDisqueExterne);
    }

    // @PutMapping("/updateDisqueExterne")
    // public DisqueExterne UpdateDisqueExterne(@RequestBody DisqueExterne
    // DisqueExterne) {
    // return DisqueExterneService.UpdateDisqueExterne(DisqueExterne);
    // }

    @DeleteMapping("/delete/{idDisqueExterne}")
    public String DeleteDisqueExterne(@PathVariable Long idDisqueExterne) {
        return DisqueExterneService.DeleteDisqueExterne(idDisqueExterne);
    }

}
