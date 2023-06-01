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

import fsb.pfe.project.Model.Pile;
import fsb.pfe.project.service.PileService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PileController {

    private PileService PileService;

    @PostMapping("/addPile")
    public Pile CreatePile(@RequestBody Pile Pile) {
        return PileService.CreatePile(Pile);
    }

    // @PostMapping("/addPiles")
    // public List<Pile> CreatePiles(@RequestBody List<Pile>
    // Pile) {
    // return PileService.CreatePiles(Pile);
    // }

    @GetMapping("/Piles")
    public List<Pile> getPiles() {
        return PileService.getPiles();
    }

    @GetMapping("/Pile/{idPile}")
    public Pile getPileById(@PathVariable Long idPile) {
        return PileService.getPileById(idPile);
    }

    // @PutMapping("/updatePile")
    // public Pile UpdatePile(@RequestBody Pile Pile) {
    // return PileService.UpdatePile(Pile);
    // }

    @DeleteMapping("/delete/{idPile}")
    public String DeletePile(@PathVariable Long idPile) {
        return PileService.DeletePile(idPile);
    }

}
