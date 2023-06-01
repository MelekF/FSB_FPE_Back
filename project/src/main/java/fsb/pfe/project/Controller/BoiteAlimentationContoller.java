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

import fsb.pfe.project.Model.BoiteAlimentation;
import fsb.pfe.project.service.BoiteAlimentationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BoiteAlimentationContoller {

    private BoiteAlimentationService BoiteAlimentationService;

    @PostMapping("/addBoiteAlimentation")
    public BoiteAlimentation CreateBoiteAlimentation(@RequestBody BoiteAlimentation BoiteAlimentation) {
        return BoiteAlimentationService.CreateBoiteAlimentation(BoiteAlimentation);
    }

    // @PostMapping("/addBoiteAlimentations")
    // public List<BoiteAlimentation> CreateBoiteAlimentations(@RequestBody
    // List<BoiteAlimentation>
    // BoiteAlimentation) {
    // return BoiteAlimentationService.CreateBoiteAlimentations(BoiteAlimentation);
    // }

    @GetMapping("/BoiteAlimentations")
    public List<BoiteAlimentation> getBoiteAlimentations() {
        return BoiteAlimentationService.getBoiteAlimentations();
    }

    @GetMapping("/BoiteAlimentation/{idBoiteAlimentation}")
    public BoiteAlimentation getBoiteAlimentationById(@PathVariable Long idBoiteAlimentation) {
        return BoiteAlimentationService.getBoiteAlimentationById(idBoiteAlimentation);
    }

    // @PutMapping("/updateBoiteAlimentation")
    // public BoiteAlimentation UpdateBoiteAlimentation(@RequestBody
    // BoiteAlimentation BoiteAlimentation) {
    // return BoiteAlimentationService.UpdateBoiteAlimentation(BoiteAlimentation);
    // }

    @DeleteMapping("/delete/{idBoiteAlimentation}")
    public String DeleteBoiteAlimentation(@PathVariable Long idBoiteAlimentation) {
        return BoiteAlimentationService.DeleteBoiteAlimentation(idBoiteAlimentation);
    }

}
