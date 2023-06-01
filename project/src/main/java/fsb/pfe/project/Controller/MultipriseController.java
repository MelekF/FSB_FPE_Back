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

import fsb.pfe.project.Model.Multiprise;
import fsb.pfe.project.service.MultipriseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class MultipriseController {

    private MultipriseService MultipriseService;

    @PostMapping("/addMultiprise")
    public Multiprise CreateMultiprise(@RequestBody Multiprise Multiprise) {
        return MultipriseService.CreateMultiprise(Multiprise);
    }

    // @PostMapping("/addMultiprises")
    // public List<Multiprise> CreateMultiprises(@RequestBody List<Multiprise>
    // Multiprise) {
    // return MultipriseService.CreateMultiprises(Multiprise);
    // }

    @GetMapping("/Multiprises")
    public List<Multiprise> getMultiprises() {
        return MultipriseService.getMultiprises();
    }

    @GetMapping("/Multiprise/{idMultiprise}")
    public Multiprise getMultipriseById(@PathVariable Long idMultiprise) {
        return MultipriseService.getMultipriseById(idMultiprise);
    }

    // @PutMapping("/updateMultiprise")
    // public Multiprise UpdateMultiprise(@RequestBody Multiprise Multiprise) {
    // return MultipriseService.UpdateMultiprise(Multiprise);
    // }

    @DeleteMapping("/delete/{idMultiprise}")
    public String DeleteMultiprise(@PathVariable Long idMultiprise) {
        return MultipriseService.DeleteMultiprise(idMultiprise);
    }

}
