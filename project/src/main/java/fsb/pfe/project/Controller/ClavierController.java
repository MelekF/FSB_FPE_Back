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

import fsb.pfe.project.Model.Clavier;
import fsb.pfe.project.service.ClavierService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ClavierController {

    private ClavierService ClavierService;

    @PostMapping("/addClavier")
    public Clavier CreateClavier(@RequestBody Clavier Clavier) {
        return ClavierService.CreateClavier(Clavier);
    }

    // @PostMapping("/addClaviers")
    // public List<Clavier> CreateClaviers(@RequestBody List<Clavier>
    // Clavier) {
    // return ClavierService.CreateClaviers(Clavier);
    // }

    @GetMapping("/Claviers")
    public List<Clavier> getClaviers() {
        return ClavierService.getClaviers();
    }

    @GetMapping("/Clavier/{idClavier}")
    public Clavier getClavierById(@PathVariable Long idClavier) {
        return ClavierService.getClavierById(idClavier);
    }

    // @PutMapping("/updateClavier")
    // public Clavier UpdateClavier(@RequestBody Clavier Clavier) {
    // return ClavierService.UpdateClavier(Clavier);
    // }

    @DeleteMapping("/delete/{idClavier}")
    public String DeleteClavier(@PathVariable Long idClavier) {
        return ClavierService.DeleteClavier(idClavier);
    }

}
