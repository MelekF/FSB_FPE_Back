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

import fsb.pfe.project.Model.Souris;
import fsb.pfe.project.service.SourisService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SourisController {

    private SourisService SourisService;

    @PostMapping("/addSouris")
    public Souris CreateSouris(@RequestBody Souris Souris) {
        return SourisService.CreateSouris(Souris);
    }

    // @PostMapping("/addSouriss")
    // public List<Souris> CreateSouriss(@RequestBody List<Souris>
    // Souris) {
    // return SourisService.CreateSouriss(Souris);
    // }

    @GetMapping("/Souriss")
    public List<Souris> getSouriss() {
        return SourisService.getSouriss();
    }

    @GetMapping("/Souris/{idSouris}")
    public Souris getSourisById(@PathVariable Long idSouris) {
        return SourisService.getSourisById(idSouris);
    }

    // @PutMapping("/updateSouris")
    // public Souris UpdateSouris(@RequestBody Souris Souris) {
    // return SourisService.UpdateSouris(Souris);
    // }

    @DeleteMapping("/delete/{idSouris}")
    public String DeleteSouris(@PathVariable Long idSouris) {
        return SourisService.DeleteSouris(idSouris);
    }

}
