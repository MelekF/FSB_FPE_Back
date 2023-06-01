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

import fsb.pfe.project.Model.Tournevis;
import fsb.pfe.project.service.TournevisService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TournevisController {

    private TournevisService TournevisService;

    @PostMapping("/addTournevis")
    public Tournevis CreateTournevis(@RequestBody Tournevis Tournevis) {
        return TournevisService.CreateTournevis(Tournevis);
    }

    // @PostMapping("/addTourneviss")
    // public List<Tournevis> CreateTourneviss(@RequestBody List<Tournevis>
    // Tournevis) {
    // return TournevisService.CreateTourneviss(Tournevis);
    // }

    @GetMapping("/Tourneviss")
    public List<Tournevis> getTourneviss() {
        return TournevisService.getTourneviss();
    }

    @GetMapping("/Tournevis/{idTournevis}")
    public Tournevis getTournevisById(@PathVariable Long idTournevis) {
        return TournevisService.getTournevisById(idTournevis);
    }

    // @PutMapping("/updateTournevis")
    // public Tournevis UpdateTournevis(@RequestBody Tournevis Tournevis) {
    // return TournevisService.UpdateTournevis(Tournevis);
    // }

    @DeleteMapping("/delete/{idTournevis}")
    public String DeleteTournevis(@PathVariable Long idTournevis) {
        return TournevisService.DeleteTournevis(idTournevis);
    }

}
