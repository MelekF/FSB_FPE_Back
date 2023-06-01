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

import fsb.pfe.project.Model.CarteGraphique;
import fsb.pfe.project.service.CarteGraphiqueService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CarteGraphiqueController {

    private CarteGraphiqueService CarteGraphiqueService;

    @PostMapping("/addCarteGraphique")
    public CarteGraphique CreateCarteGraphique(@RequestBody CarteGraphique CarteGraphique) {
        return CarteGraphiqueService.CreateCarteGraphique(CarteGraphique);
    }

    // @PostMapping("/addCarteGraphiques")
    // public List<CarteGraphique> CreateCarteGraphiques(@RequestBody
    // List<CarteGraphique>
    // CarteGraphique) {
    // return CarteGraphiqueService.CreateCarteGraphiques(CarteGraphique);
    // }

    @GetMapping("/CarteGraphiques")
    public List<CarteGraphique> getCarteGraphiques() {
        return CarteGraphiqueService.getCarteGraphiques();
    }

    @GetMapping("/CarteGraphique/{idCarteGraphique}")
    public CarteGraphique getCarteGraphiqueById(@PathVariable Long idCarteGraphique) {
        return CarteGraphiqueService.getCarteGraphiqueById(idCarteGraphique);
    }

    // @PutMapping("/updateCarteGraphique")
    // public CarteGraphique UpdateCarteGraphique(@RequestBody CarteGraphique
    // CarteGraphique) {
    // return CarteGraphiqueService.UpdateCarteGraphique(CarteGraphique);
    // }

    @DeleteMapping("/delete/{idCarteGraphique}")
    public String DeleteCarteGraphique(@PathVariable Long idCarteGraphique) {
        return CarteGraphiqueService.DeleteCarteGraphique(idCarteGraphique);
    }

}
