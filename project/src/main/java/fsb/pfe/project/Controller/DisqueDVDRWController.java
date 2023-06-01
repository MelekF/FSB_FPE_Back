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

import fsb.pfe.project.Model.DisqueDVDRW;
import fsb.pfe.project.service.DisqueDVDRWService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class DisqueDVDRWController {

    private DisqueDVDRWService DisqueDVDRWService;

    @PostMapping("/addDisqueDVDRW")
    public DisqueDVDRW CreateDisqueDVDRW(@RequestBody DisqueDVDRW DisqueDVDRW) {
        return DisqueDVDRWService.CreateDisqueDVDRW(DisqueDVDRW);
    }

    // @PostMapping("/addDisqueDVDRWs")
    // public List<DisqueDVDRW> CreateDisqueDVDRWs(@RequestBody List<DisqueDVDRW>
    // DisqueDVDRW) {
    // return DisqueDVDRWService.CreateDisqueDVDRWs(DisqueDVDRW);
    // }

    @GetMapping("/DisqueDVDRWs")
    public List<DisqueDVDRW> getDisqueDVDRWs() {
        return DisqueDVDRWService.getDisqueDVDRWs();
    }

    @GetMapping("/DisqueDVDRW/{idDisqueDVDRW}")
    public DisqueDVDRW getDisqueDVDRWById(@PathVariable Long idDisqueDVDRW) {
        return DisqueDVDRWService.getDisqueDVDRWById(idDisqueDVDRW);
    }

    // @PutMapping("/updateDisqueDVDRW")
    // public DisqueDVDRW UpdateDisqueDVDRW(@RequestBody DisqueDVDRW DisqueDVDRW) {
    // return DisqueDVDRWService.UpdateDisqueDVDRW(DisqueDVDRW);
    // }

    @DeleteMapping("/delete/{idDisqueDVDRW}")
    public String DeleteDisqueDVDRW(@PathVariable Long idDisqueDVDRW) {
        return DisqueDVDRWService.DeleteDisqueDVDRW(idDisqueDVDRW);
    }

}
