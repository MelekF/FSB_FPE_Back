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

import fsb.pfe.project.Model.Pc;
import fsb.pfe.project.service.PcService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PcController {

    private PcService PcService;

    @PostMapping("/addPc")
    public Pc CreatePc(@RequestBody Pc Pc) {
        return PcService.CreatePc(Pc);
    }

    // @PostMapping("/addPcs")
    // public List<Pc> CreatePcs(@RequestBody List<Pc>
    // Pc) {
    // return PcService.CreatePcs(Pc);
    // }

    @GetMapping("/Pcs")
    public List<Pc> getPcs() {
        return PcService.getPcs();
    }

    @GetMapping("/Pc/{idPc}")
    public Pc getPcById(@PathVariable Long idPc) {
        return PcService.getPcById(idPc);
    }

    // @PutMapping("/updatePc")
    // public Pc UpdatePc(@RequestBody Pc Pc) {
    // return PcService.UpdatePc(Pc);
    // }

    @DeleteMapping("/delete/{idPc}")
    public String DeletePc(@PathVariable Long idPc) {
        return PcService.DeletePc(idPc);
    }

}
