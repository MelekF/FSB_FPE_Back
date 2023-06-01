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

import fsb.pfe.project.Model.BaretteMemoire;
import fsb.pfe.project.service.BaretteMemoireService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BaretteMemoireController {

    private BaretteMemoireService BaretteMemoireService;

    @PostMapping("/addBaretteMemoire")
    public BaretteMemoire CreateBaretteMemoire(@RequestBody BaretteMemoire BaretteMemoire) {
        return BaretteMemoireService.CreateBaretteMemoire(BaretteMemoire);
    }

    // @PostMapping("/addBaretteMemoires")
    // public List<BaretteMemoire> CreateBaretteMemoires(@RequestBody
    // List<BaretteMemoire>
    // BaretteMemoire) {
    // return BaretteMemoireService.CreateBaretteMemoires(BaretteMemoire);
    // }

    @GetMapping("/BaretteMemoires")
    public List<BaretteMemoire> getBaretteMemoires() {
        return BaretteMemoireService.getBaretteMemoires();
    }

    @GetMapping("/BaretteMemoire/{idBaretteMemoire}")
    public BaretteMemoire getBaretteMemoireById(@PathVariable Long idBaretteMemoire) {
        return BaretteMemoireService.getBaretteMemoireById(idBaretteMemoire);
    }

    // @PutMapping("/updateBaretteMemoire")
    // public BaretteMemoire UpdateBaretteMemoire(@RequestBody BaretteMemoire
    // BaretteMemoire) {
    // return BaretteMemoireService.UpdateBaretteMemoire(BaretteMemoire);
    // }

    @DeleteMapping("/delete/{idBaretteMemoire}")
    public String DeleteBaretteMemoire(@PathVariable Long idBaretteMemoire) {
        return BaretteMemoireService.DeleteBaretteMemoire(idBaretteMemoire);
    }

}
