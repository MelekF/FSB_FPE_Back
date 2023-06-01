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

import fsb.pfe.project.Model.CarteSD;
import fsb.pfe.project.service.CarteSDService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CarteSDController {

    private CarteSDService CarteSDService;

    @PostMapping("/addCarteSD")
    public CarteSD CreateCarteSD(@RequestBody CarteSD CarteSD) {
        return CarteSDService.CreateCarteSD(CarteSD);
    }

    // @PostMapping("/addCarteSDs")
    // public List<CarteSD> CreateCarteSDs(@RequestBody List<CarteSD>
    // CarteSD) {
    // return CarteSDService.CreateCarteSDs(CarteSD);
    // }

    @GetMapping("/CarteSDs")
    public List<CarteSD> getCarteSDs() {
        return CarteSDService.getCarteSDs();
    }

    @GetMapping("/CarteSD/{idCarteSD}")
    public CarteSD getCarteSDById(@PathVariable Long idCarteSD) {
        return CarteSDService.getCarteSDById(idCarteSD);
    }

    // @PutMapping("/updateCarteSD")
    // public CarteSD UpdateCarteSD(@RequestBody CarteSD CarteSD) {
    // return CarteSDService.UpdateCarteSD(CarteSD);
    // }

    @DeleteMapping("/delete/{idCarteSD}")
    public String DeleteCarteSD(@PathVariable Long idCarteSD) {
        return CarteSDService.DeleteCarteSD(idCarteSD);
    }

}
