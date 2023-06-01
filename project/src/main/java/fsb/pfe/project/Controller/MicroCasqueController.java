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

import fsb.pfe.project.Model.MicroCasque;
import fsb.pfe.project.service.MicroCasqueService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class MicroCasqueController {

    private MicroCasqueService MicroCasqueService;

    @PostMapping("/addMicroCasque")
    public MicroCasque CreateMicroCasque(@RequestBody MicroCasque MicroCasque) {
        return MicroCasqueService.CreateMicroCasque(MicroCasque);
    }

    // @PostMapping("/addMicroCasques")
    // public List<MicroCasque> CreateMicroCasques(@RequestBody List<MicroCasque>
    // MicroCasque) {
    // return MicroCasqueService.CreateMicroCasques(MicroCasque);
    // }

    @GetMapping("/MicroCasques")
    public List<MicroCasque> getMicroCasques() {
        return MicroCasqueService.getMicroCasques();
    }

    @GetMapping("/MicroCasque/{idMicroCasque}")
    public MicroCasque getMicroCasqueById(@PathVariable Long idMicroCasque) {
        return MicroCasqueService.getMicroCasqueById(idMicroCasque);
    }

    // @PutMapping("/updateMicroCasque")
    // public MicroCasque UpdateMicroCasque(@RequestBody MicroCasque MicroCasque) {
    // return MicroCasqueService.UpdateMicroCasque(MicroCasque);
    // }

    @DeleteMapping("/delete/{idMicroCasque}")
    public String DeleteMicroCasque(@PathVariable Long idMicroCasque) {
        return MicroCasqueService.DeleteMicroCasque(idMicroCasque);
    }

}
