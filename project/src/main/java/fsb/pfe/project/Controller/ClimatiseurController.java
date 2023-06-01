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

import fsb.pfe.project.Model.Climatiseur;
import fsb.pfe.project.service.ClimatiseurService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ClimatiseurController {

    private ClimatiseurService ClimatiseurService;

    @PostMapping("/addClimatiseur")
    public Climatiseur CreateClimatiseur(@RequestBody Climatiseur Climatiseur) {
        return ClimatiseurService.CreateClimatiseur(Climatiseur);
    }

    // @PostMapping("/addClimatiseurs")
    // public List<Climatiseur> CreateClimatiseurs(@RequestBody List<Climatiseur>
    // Climatiseur) {
    // return ClimatiseurService.CreateClimatiseurs(Climatiseur);
    // }

    @GetMapping("/Climatiseurs")
    public List<Climatiseur> getClimatiseurs() {
        return ClimatiseurService.getClimatiseurs();
    }

    @GetMapping("/Climatiseur/{idClimatiseur}")
    public Climatiseur getClimatiseurById(@PathVariable Long idClimatiseur) {
        return ClimatiseurService.getClimatiseurById(idClimatiseur);
    }

    // @PutMapping("/updateClimatiseur")
    // public Climatiseur UpdateClimatiseur(@RequestBody Climatiseur Climatiseur) {
    // return ClimatiseurService.UpdateClimatiseur(Climatiseur);
    // }

    @DeleteMapping("/delete/{idClimatiseur}")
    public String DeleteClimatiseur(@PathVariable Long idClimatiseur) {
        return ClimatiseurService.DeleteClimatiseur(idClimatiseur);
    }

}
