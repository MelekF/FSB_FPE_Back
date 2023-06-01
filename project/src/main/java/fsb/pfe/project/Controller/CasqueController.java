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

import fsb.pfe.project.Model.Casque;
import fsb.pfe.project.service.CasqueService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CasqueController {

    private CasqueService CasqueService;

    @PostMapping("/addCasque")
    public Casque CreateCasque(@RequestBody Casque Casque) {
        return CasqueService.CreateCasque(Casque);
    }

    // @PostMapping("/addCasques")
    // public List<Casque> CreateCasques(@RequestBody List<Casque>
    // Casque) {
    // return CasqueService.CreateCasques(Casque);
    // }

    @GetMapping("/Casques")
    public List<Casque> getCasques() {
        return CasqueService.getCasques();
    }

    @GetMapping("/Casque/{idCasque}")
    public Casque getCasqueById(@PathVariable Long idCasque) {
        return CasqueService.getCasqueById(idCasque);
    }

    // @PutMapping("/updateCasque")
    // public Casque UpdateCasque(@RequestBody Casque Casque) {
    // return CasqueService.UpdateCasque(Casque);
    // }

    @DeleteMapping("/delete/{idCasque}")
    public String DeleteCasque(@PathVariable Long idCasque) {
        return CasqueService.DeleteCasque(idCasque);
    }

}
