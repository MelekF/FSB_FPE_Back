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

import fsb.pfe.project.Model.Boiteaoutils;
import fsb.pfe.project.service.BoiteaoutilsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BoiteaoutilsController {

    private BoiteaoutilsService BoiteaoutilsService;

    @PostMapping("/addBoiteaoutils")
    public Boiteaoutils CreateBoiteaoutils(@RequestBody Boiteaoutils Boiteaoutils) {
        return BoiteaoutilsService.CreateBoiteaoutils(Boiteaoutils);
    }

    // @PostMapping("/addBoiteaoutilss")
    // public List<Boiteaoutils> CreateBoiteaoutilss(@RequestBody List<Boiteaoutils>
    // Boiteaoutils) {
    // return BoiteaoutilsService.CreateBoiteaoutilss(Boiteaoutils);
    // }

    @GetMapping("/Boiteaoutilss")
    public List<Boiteaoutils> getBoiteaoutilss() {
        return BoiteaoutilsService.getBoiteaoutilss();
    }

    @GetMapping("/Boiteaoutils/{idBoiteaoutils}")
    public Boiteaoutils getBoiteaoutilsById(@PathVariable Long idBoiteaoutils) {
        return BoiteaoutilsService.getBoiteaoutilsById(idBoiteaoutils);
    }

    // @PutMapping("/updateBoiteaoutils")
    // public Boiteaoutils UpdateBoiteaoutils(@RequestBody Boiteaoutils
    // Boiteaoutils) {
    // return BoiteaoutilsService.UpdateBoiteaoutils(Boiteaoutils);
    // }

    @DeleteMapping("/delete/{idBoiteaoutils}")
    public String DeleteBoiteaoutils(@PathVariable Long idBoiteaoutils) {
        return BoiteaoutilsService.DeleteBoiteaoutils(idBoiteaoutils);
    }

}
