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

import fsb.pfe.project.Model.Onduleur;
import fsb.pfe.project.service.OnduleurService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class OnduleurController {

    private OnduleurService OnduleurService;

    @PostMapping("/addOnduleur")
    public Onduleur CreateOnduleur(@RequestBody Onduleur Onduleur) {
        return OnduleurService.CreateOnduleur(Onduleur);
    }

    // @PostMapping("/addOnduleurs")
    // public List<Onduleur> CreateOnduleurs(@RequestBody List<Onduleur>
    // Onduleur) {
    // return OnduleurService.CreateOnduleurs(Onduleur);
    // }

    @GetMapping("/Onduleurs")
    public List<Onduleur> getOnduleurs() {
        return OnduleurService.getOnduleurs();
    }

    @GetMapping("/Onduleur/{idOnduleur}")
    public Onduleur getOnduleurById(@PathVariable Long idOnduleur) {
        return OnduleurService.getOnduleurById(idOnduleur);
    }

    // @PutMapping("/updateOnduleur")
    // public Onduleur UpdateOnduleur(@RequestBody Onduleur Onduleur) {
    // return OnduleurService.UpdateOnduleur(Onduleur);
    // }

    @DeleteMapping("/delete/{idOnduleur}")
    public String DeleteOnduleur(@PathVariable Long idOnduleur) {
        return OnduleurService.DeleteOnduleur(idOnduleur);
    }

}
