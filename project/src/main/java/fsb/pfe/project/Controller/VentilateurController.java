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

import fsb.pfe.project.Model.Ventilateur;
import fsb.pfe.project.service.VentilateurService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class VentilateurController {

    private VentilateurService VentilateurService;

    @PostMapping("/addVentilateur")
    public Ventilateur CreateVentilateur(@RequestBody Ventilateur Ventilateur) {
        return VentilateurService.CreateVentilateur(Ventilateur);
    }

    // @PostMapping("/addVentilateurs")
    // public List<Ventilateur> CreateVentilateurs(@RequestBody List<Ventilateur>
    // Ventilateur) {
    // return VentilateurService.CreateVentilateurs(Ventilateur);
    // }

    @GetMapping("/Ventilateurs")
    public List<Ventilateur> getVentilateurs() {
        return VentilateurService.getVentilateurs();
    }

    @GetMapping("/Ventilateur/{idVentilateur}")
    public Ventilateur getVentilateurById(@PathVariable Long idVentilateur) {
        return VentilateurService.getVentilateurById(idVentilateur);
    }

    // @PutMapping("/updateVentilateur")
    // public Ventilateur UpdateVentilateur(@RequestBody Ventilateur Ventilateur) {
    // return VentilateurService.UpdateVentilateur(Ventilateur);
    // }

    @DeleteMapping("/delete/{idVentilateur}")
    public String DeleteVentilateur(@PathVariable Long idVentilateur) {
        return VentilateurService.DeleteVentilateur(idVentilateur);
    }

}
