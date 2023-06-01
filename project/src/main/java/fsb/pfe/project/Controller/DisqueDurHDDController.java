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

import fsb.pfe.project.Model.DisqueDurHDD;
import fsb.pfe.project.service.DisqueDurHDDService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class DisqueDurHDDController {

    private DisqueDurHDDService DisqueDurHDDService;

    @PostMapping("/addDisqueDurHDD")
    public DisqueDurHDD CreateDisqueDurHDD(@RequestBody DisqueDurHDD DisqueDurHDD) {
        return DisqueDurHDDService.CreateDisqueDurHDD(DisqueDurHDD);
    }

    // @PostMapping("/addDisqueDurHDDs")
    // public List<DisqueDurHDD> CreateDisqueDurHDDs(@RequestBody List<DisqueDurHDD>
    // DisqueDurHDD) {
    // return DisqueDurHDDService.CreateDisqueDurHDDs(DisqueDurHDD);
    // }

    @GetMapping("/DisqueDurHDDs")
    public List<DisqueDurHDD> getDisqueDurHDDs() {
        return DisqueDurHDDService.getDisqueDurHDDs();
    }

    @GetMapping("/DisqueDurHDD/{idDisqueDurHDD}")
    public DisqueDurHDD getDisqueDurHDDById(@PathVariable Long idDisqueDurHDD) {
        return DisqueDurHDDService.getDisqueDurHDDById(idDisqueDurHDD);
    }

    // @PutMapping("/updateDisqueDurHDD")
    // public DisqueDurHDD UpdateDisqueDurHDD(@RequestBody DisqueDurHDD
    // DisqueDurHDD) {
    // return DisqueDurHDDService.UpdateDisqueDurHDD(DisqueDurHDD);
    // }

    @DeleteMapping("/delete/{idDisqueDurHDD}")
    public String DeleteDisqueDurHDD(@PathVariable Long idDisqueDurHDD) {
        return DisqueDurHDDService.DeleteDisqueDurHDD(idDisqueDurHDD);
    }

}
