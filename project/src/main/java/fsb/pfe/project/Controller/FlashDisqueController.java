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

import fsb.pfe.project.Model.FlashDisque;
import fsb.pfe.project.service.FlashDisqueService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class FlashDisqueController {

    private FlashDisqueService FlashDisqueService;

    @PostMapping("/addFlashDisque")
    public FlashDisque CreateFlashDisque(@RequestBody FlashDisque FlashDisque) {
        return FlashDisqueService.CreateFlashDisque(FlashDisque);
    }

    // @PostMapping("/addFlashDisques")
    // public List<FlashDisque> CreateFlashDisques(@RequestBody List<FlashDisque>
    // FlashDisque) {
    // return FlashDisqueService.CreateFlashDisques(FlashDisque);
    // }

    @GetMapping("/FlashDisques")
    public List<FlashDisque> getFlashDisques() {
        return FlashDisqueService.getFlashDisques();
    }

    @GetMapping("/FlashDisque/{idFlashDisque}")
    public FlashDisque getFlashDisqueById(@PathVariable Long idFlashDisque) {
        return FlashDisqueService.getFlashDisqueById(idFlashDisque);
    }

    // @PutMapping("/updateFlashDisque")
    // public FlashDisque UpdateFlashDisque(@RequestBody FlashDisque FlashDisque) {
    // return FlashDisqueService.UpdateFlashDisque(FlashDisque);
    // }

    @DeleteMapping("/delete/{idFlashDisque}")
    public String DeleteFlashDisque(@PathVariable Long idFlashDisque) {
        return FlashDisqueService.DeleteFlashDisque(idFlashDisque);
    }

}
