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

import fsb.pfe.project.Model.CableUSB;
import fsb.pfe.project.service.CableUSBService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CableUSBController {

    private CableUSBService CableUSBService;

    @PostMapping("/addCableUSB")
    public CableUSB CreateCableUSB(@RequestBody CableUSB CableUSB) {
        return CableUSBService.CreateCableUSB(CableUSB);
    }

    // @PostMapping("/addCableUSBs")
    // public List<CableUSB> CreateCableUSBs(@RequestBody List<CableUSB>
    // CableUSB) {
    // return CableUSBService.CreateCableUSBs(CableUSB);
    // }

    @GetMapping("/CableUSBs")
    public List<CableUSB> getCableUSBs() {
        return CableUSBService.getCableUSBs();
    }

    @GetMapping("/CableUSB/{idCableUSB}")
    public CableUSB getCableUSBById(@PathVariable Long idCableUSB) {
        return CableUSBService.getCableUSBById(idCableUSB);
    }

    // @PutMapping("/updateCableUSB")
    // public CableUSB UpdateCableUSB(@RequestBody CableUSB CableUSB) {
    // return CableUSBService.UpdateCableUSB(CableUSB);
    // }

    @DeleteMapping("/delete/{idCableUSB}")
    public String DeleteCableUSB(@PathVariable Long idCableUSB) {
        return CableUSBService.DeleteCableUSB(idCableUSB);
    }

}
