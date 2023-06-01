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

import fsb.pfe.project.Model.Salle;
import fsb.pfe.project.service.SalleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SalleController {

    private SalleService SalleService;

    @PostMapping("/addSalle")
    public Salle CreateSalle(@RequestBody Salle Salle) {
        return SalleService.CreateSalle(Salle);
    }

    @PostMapping("/addSalles")
    public List<Salle> CreateSalles(@RequestBody List<Salle> Salle) {
        return SalleService.CreateSalles(Salle);
    }

    @GetMapping("/Salles")
    public List<Salle> getSalles() {
        return SalleService.getSalles();
    }

    @GetMapping("/Salle/{idSalle}")
    public Salle getSalleById(@PathVariable Long idSalle) {
        return SalleService.getSalleById(idSalle);
    }

    // @PutMapping("/updateSalle")
    // public Salle UpdateSalle(@RequestBody Salle Salle) {
    // return SalleService.UpdateSalle(Salle);
    // }

    @DeleteMapping("/delete/{idSalle}")
    public String DeleteSalle(@PathVariable Long idSalle) {
        return SalleService.DeleteSalle(idSalle);
    }

}
