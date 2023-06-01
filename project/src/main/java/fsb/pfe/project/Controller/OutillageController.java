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

import fsb.pfe.project.Model.Outillage;
import fsb.pfe.project.service.OutillageService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class OutillageController {

    private OutillageService OutillageService;

    @PostMapping("/addOutillage")
    public Outillage CreateOutillage(@RequestBody Outillage Outillage) {
        return OutillageService.CreateOutillage(Outillage);
    }

    // @PostMapping("/addOutillages")
    // public List<Outillage> CreateOutillages(@RequestBody List<Outillage>
    // Outillage) {
    // return OutillageService.CreateOutillages(Outillage);
    // }

    @GetMapping("/Outillages")
    public List<Outillage> getOutillages() {
        return OutillageService.getOutillages();
    }

    @GetMapping("/Outillage/{idOutillage}")
    public Outillage getOutillageById(@PathVariable Long idOutillage) {
        return OutillageService.getOutillageById(idOutillage);
    }

    // @PutMapping("/updateOutillage")
    // public Outillage UpdateOutillage(@RequestBody Outillage Outillage) {
    // return OutillageService.UpdateOutillage(Outillage);
    // }

    @DeleteMapping("/delete/{idOutillage}")
    public String DeleteOutillage(@PathVariable Long idOutillage) {
        return OutillageService.DeleteOutillage(idOutillage);
    }

}
