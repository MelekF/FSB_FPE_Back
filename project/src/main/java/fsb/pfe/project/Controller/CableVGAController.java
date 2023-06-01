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

import fsb.pfe.project.Model.CableVGA;
import fsb.pfe.project.service.CableVGAService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CableVGAController {

    private CableVGAService CableVGAService;

    @PostMapping("/addCableVGA")
    public CableVGA CreateCableVGA(@RequestBody CableVGA CableVGA) {
        return CableVGAService.CreateCableVGA(CableVGA);
    }

    // @PostMapping("/addCableVGAs")
    // public List<CableVGA> CreateCableVGAs(@RequestBody List<CableVGA>
    // CableVGA) {
    // return CableVGAService.CreateCableVGAs(CableVGA);
    // }

    @GetMapping("/CableVGAs")
    public List<CableVGA> getCableVGAs() {
        return CableVGAService.getCableVGAs();
    }

    @GetMapping("/CableVGA/{idCableVGA}")
    public CableVGA getCableVGAById(@PathVariable Long idCableVGA) {
        return CableVGAService.getCableVGAById(idCableVGA);
    }

    // @PutMapping("/updateCableVGA")
    // public CableVGA UpdateCableVGA(@RequestBody CableVGA CableVGA) {
    // return CableVGAService.UpdateCableVGA(CableVGA);
    // }

    @DeleteMapping("/delete/{idCableVGA}")
    public String DeleteCableVGA(@PathVariable Long idCableVGA) {
        return CableVGAService.DeleteCableVGA(idCableVGA);
    }

}
