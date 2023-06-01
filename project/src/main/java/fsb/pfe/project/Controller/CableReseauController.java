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

import fsb.pfe.project.Model.CableReseau;
import fsb.pfe.project.service.CableReseauService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CableReseauController {

    private CableReseauService CableReseauService;

    @PostMapping("/addCableReseau")
    public CableReseau CreateCableReseau(@RequestBody CableReseau CableReseau) {
        return CableReseauService.CreateCableReseau(CableReseau);
    }

    // @PostMapping("/addCableReseaus")
    // public List<CableReseau> CreateCableReseaus(@RequestBody List<CableReseau>
    // CableReseau) {
    // return CableReseauService.CreateCableReseaus(CableReseau);
    // }

    @GetMapping("/CableReseaus")
    public List<CableReseau> getCableReseaus() {
        return CableReseauService.getCableReseaus();
    }

    @GetMapping("/CableReseau/{idCableReseau}")
    public CableReseau getCableReseauById(@PathVariable Long idCableReseau) {
        return CableReseauService.getCableReseauById(idCableReseau);
    }

    // @PutMapping("/updateCableReseau")
    // public CableReseau UpdateCableReseau(@RequestBody CableReseau CableReseau) {
    // return CableReseauService.UpdateCableReseau(CableReseau);
    // }

    @DeleteMapping("/delete/{idCableReseau}")
    public String DeleteCableReseau(@PathVariable Long idCableReseau) {
        return CableReseauService.DeleteCableReseau(idCableReseau);
    }

}
