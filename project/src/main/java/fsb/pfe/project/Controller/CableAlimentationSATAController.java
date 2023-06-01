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

import fsb.pfe.project.Model.CableAlimentationSATA;
import fsb.pfe.project.service.CableAlimentationSATAService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CableAlimentationSATAController {

    private CableAlimentationSATAService CableAlimentationSATAService;

    @PostMapping("/addCableAlimentationSATA")
    public CableAlimentationSATA CreateCableAlimentationSATA(@RequestBody CableAlimentationSATA CableAlimentationSATA) {
        return CableAlimentationSATAService.CreateCableAlimentationSATA(CableAlimentationSATA);
    }

    // @PostMapping("/addCableAlimentationSATAs")
    // public List<CableAlimentationSATA> CreateCableAlimentationSATAs(@RequestBody
    // List<CableAlimentationSATA>
    // CableAlimentationSATA) {
    // return
    // CableAlimentationSATAService.CreateCableAlimentationSATAs(CableAlimentationSATA);
    // }

    @GetMapping("/CableAlimentationSATAs")
    public List<CableAlimentationSATA> getCableAlimentationSATAs() {
        return CableAlimentationSATAService.getCableAlimentationSATAs();
    }

    @GetMapping("/CableAlimentationSATA/{idCableAlimentationSATA}")
    public CableAlimentationSATA getCableAlimentationSATAById(@PathVariable Long idCableAlimentationSATA) {
        return CableAlimentationSATAService.getCableAlimentationSATAById(idCableAlimentationSATA);
    }

    // @PutMapping("/updateCableAlimentationSATA")
    // public CableAlimentationSATA UpdateCableAlimentationSATA(@RequestBody
    // CableAlimentationSATA CableAlimentationSATA) {
    // return
    // CableAlimentationSATAService.UpdateCableAlimentationSATA(CableAlimentationSATA);
    // }

    @DeleteMapping("/delete/{idCableAlimentationSATA}")
    public String DeleteCableAlimentationSATA(@PathVariable Long idCableAlimentationSATA) {
        return CableAlimentationSATAService.DeleteCableAlimentationSATA(idCableAlimentationSATA);
    }

}
