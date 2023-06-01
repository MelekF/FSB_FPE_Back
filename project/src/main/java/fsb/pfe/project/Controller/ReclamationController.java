package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.Reclamation;
import fsb.pfe.project.service.ReclamationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ReclamationController {
    @Autowired

    private ReclamationService ReclamationService;

    @PostMapping("/addReclamation")
    public Reclamation CreateReclamation(@RequestBody Reclamation Reclamation) {
        return ReclamationService.CreateReclamation(Reclamation);
    }

    // @PostMapping("/addReclamations")
    // public List<Reclamation> CreateReclamations(@RequestBody List<Reclamation>
    // Reclamation) {
    // return ReclamationService.CreateReclamations(Reclamation);
    // }

    @GetMapping("/Reclamations")
    public List<Reclamation> getReclamations() {
        return ReclamationService.getReclamations();
    }

    @GetMapping("/Reclamation/{idReclamation}")
    public Reclamation getReclamationById(@PathVariable Long idReclamation) {
        return ReclamationService.getReclamationById(idReclamation);
    }

    // @PutMapping("/updateReclamation")
    // public Reclamation UpdateReclamation(@RequestBody Reclamation Reclamation) {
    // return ReclamationService.updateReclamation(Reclamation);
    // }

    @DeleteMapping("/delete/{idReclamation}")
    public String DeleteReclamation(@PathVariable Long idReclamation) {
        return ReclamationService.DeleteReclamation(idReclamation);
    }

}
