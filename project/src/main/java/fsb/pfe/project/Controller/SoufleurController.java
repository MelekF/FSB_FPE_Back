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

import fsb.pfe.project.Model.Soufleur;
import fsb.pfe.project.service.SoufleurService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SoufleurController {

    private SoufleurService SoufleurService;

    @PostMapping("/addSoufleur")
    public Soufleur CreateSoufleur(@RequestBody Soufleur Soufleur) {
        return SoufleurService.CreateSoufleur(Soufleur);
    }

    // @PostMapping("/addSoufleurs")
    // public List<Soufleur> CreateSoufleurs(@RequestBody List<Soufleur>
    // Soufleur) {
    // return SoufleurService.CreateSoufleurs(Soufleur);
    // }

    @GetMapping("/Soufleurs")
    public List<Soufleur> getSoufleurs() {
        return SoufleurService.getSoufleurs();
    }

    @GetMapping("/Soufleur/{idSoufleur}")
    public Soufleur getSoufleurById(@PathVariable Long idSoufleur) {
        return SoufleurService.getSoufleurById(idSoufleur);
    }

    // @PutMapping("/updateSoufleur")
    // public Soufleur UpdateSoufleur(@RequestBody Soufleur Soufleur) {
    // return SoufleurService.UpdateSoufleur(Soufleur);
    // }

    @DeleteMapping("/delete/{idSoufleur}")
    public String DeleteSoufleur(@PathVariable Long idSoufleur) {
        return SoufleurService.DeleteSoufleur(idSoufleur);
    }

}
