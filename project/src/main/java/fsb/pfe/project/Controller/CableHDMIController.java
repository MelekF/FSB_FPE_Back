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

import fsb.pfe.project.Model.CableHDMI;
import fsb.pfe.project.service.CableHDMIService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CableHDMIController {

    private CableHDMIService CableHDMIService;

    @PostMapping("/addCableHDMI")
    public CableHDMI CreateCableHDMI(@RequestBody CableHDMI CableHDMI) {
        return CableHDMIService.CreateCableHDMI(CableHDMI);
    }

    // @PostMapping("/addCableHDMIs")
    // public List<CableHDMI> CreateCableHDMIs(@RequestBody List<CableHDMI>
    // CableHDMI) {
    // return CableHDMIService.CreateCableHDMIs(CableHDMI);
    // }

    @GetMapping("/CableHDMIs")
    public List<CableHDMI> getCableHDMIs() {
        return CableHDMIService.getCableHDMIs();
    }

    @GetMapping("/CableHDMI/{idCableHDMI}")
    public CableHDMI getCableHDMIById(@PathVariable Long idCableHDMI) {
        return CableHDMIService.getCableHDMIById(idCableHDMI);
    }

    // @PutMapping("/updateCableHDMI")
    // public CableHDMI UpdateCableHDMI(@RequestBody CableHDMI CableHDMI) {
    // return CableHDMIService.UpdateCableHDMI(CableHDMI);
    // }

    @DeleteMapping("/delete/{idCableHDMI}")
    public String DeleteCableHDMI(@PathVariable Long idCableHDMI) {
        return CableHDMIService.DeleteCableHDMI(idCableHDMI);
    }

}
