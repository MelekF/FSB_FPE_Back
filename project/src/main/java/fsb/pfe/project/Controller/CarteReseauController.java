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

import fsb.pfe.project.Model.CarteReseau;
import fsb.pfe.project.service.CarteReseauService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CarteReseauController {

    private CarteReseauService CarteReseauService;

    @PostMapping("/addCarteReseau")
    public CarteReseau CreateCarteReseau(@RequestBody CarteReseau CarteReseau) {
        return CarteReseauService.CreateCarteReseau(CarteReseau);
    }

    // @PostMapping("/addCarteReseaus")
    // public List<CarteReseau> CreateCarteReseaus(@RequestBody List<CarteReseau>
    // CarteReseau) {
    // return CarteReseauService.CreateCarteReseaus(CarteReseau);
    // }

    @GetMapping("/CarteReseaus")
    public List<CarteReseau> getCarteReseaus() {
        return CarteReseauService.getCarteReseaus();
    }

    @GetMapping("/CarteReseau/{idCarteReseau}")
    public CarteReseau getCarteReseauById(@PathVariable Long idCarteReseau) {
        return CarteReseauService.getCarteReseauById(idCarteReseau);
    }

    // @PutMapping("/updateCarteReseau")
    // public CarteReseau UpdateCarteReseau(@RequestBody CarteReseau CarteReseau) {
    // return CarteReseauService.UpdateCarteReseau(CarteReseau);
    // }

    @DeleteMapping("/delete/{idCarteReseau}")
    public String DeleteCarteReseau(@PathVariable Long idCarteReseau) {
        return CarteReseauService.DeleteCarteReseau(idCarteReseau);
    }

}
