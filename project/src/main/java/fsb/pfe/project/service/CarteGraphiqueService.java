package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CarteGraphique;
import fsb.pfe.project.Repository.CarteGraphiqueRepository;

public class CarteGraphiqueService {
    @Autowired
    private CarteGraphiqueRepository CarteGraphiqueRepository;

    // Cree un CarteGraphique
    public CarteGraphique CreateCarteGraphique(CarteGraphique CarteGraphique) {
        return CarteGraphiqueRepository.save(CarteGraphique);
    }

    // Cree des CarteGraphiques
    public List<CarteGraphique> CreateCarteGraphiques(List<CarteGraphique> CarteGraphique) {
        return CarteGraphiqueRepository.saveAll(CarteGraphique);
    }

    // get CarteGraphiques

    public List<CarteGraphique> getCarteGraphiques() {
        return CarteGraphiqueRepository.findAll();
    }

    // get CarteGraphique By Id
    public CarteGraphique getCarteGraphiqueById(Long idCarteGraphique) {
        return CarteGraphiqueRepository.findById(idCarteGraphique).orElse(null);
    }

    // Delete CarteGraphique
    public String DeleteCarteGraphique(Long idCarteGraphique) {
        CarteGraphiqueRepository.deleteById(idCarteGraphique);
        return "CarteGraphique Removed !!" + idCarteGraphique;
    }

    // UpDate CarteGraphique
    // public CarteGraphique UpdateCarteGraphique(CarteGraphique CarteGraphique) {
    // CarteGraphique existingCarteGraphique =
    // CarteGraphiqueRepository.findById(CarteGraphique.getIdCarteGraphique())
    // .orElse(null);
    // existingCarteGraphique.setCarteGraphiquenom(CarteGraphique.getCarteGraphiquenom());
    // existingCarteGraphique.setCarteGraphiqueprenom(CarteGraphique.getCarteGraphiqueprenom());
    // existingCarteGraphique.setCarteGraphiqueemail(CarteGraphique.getCarteGraphiqueemail());
    // existingCarteGraphique.setCarteGraphiquemotdepasse(CarteGraphique.getCarteGraphiquemotdepasse());
    // existingCarteGraphique.setCarteGraphiqueadress(CarteGraphique.getCarteGraphiqueadress());
    // existingCarteGraphique.setCarteGraphiquentel(CarteGraphique.getCarteGraphiquentel());

    // return CarteGraphiqueRepository.save(existingCarteGraphique);
    // }

}
