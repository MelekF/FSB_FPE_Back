package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CarteReseau;
import fsb.pfe.project.Repository.CarteReseauRepository;

public class CarteReseauService {
    @Autowired
    private CarteReseauRepository CarteReseauRepository;

    // Cree un CarteReseau
    public CarteReseau CreateCarteReseau(CarteReseau CarteReseau) {
        return CarteReseauRepository.save(CarteReseau);
    }

    // Cree des CarteReseaus
    public List<CarteReseau> CreateCarteReseaus(List<CarteReseau> CarteReseau) {
        return CarteReseauRepository.saveAll(CarteReseau);
    }

    // get CarteReseaus

    public List<CarteReseau> getCarteReseaus() {
        return CarteReseauRepository.findAll();
    }

    // get CarteReseau By Id
    public CarteReseau getCarteReseauById(Long idCarteReseau) {
        return CarteReseauRepository.findById(idCarteReseau).orElse(null);
    }

    // Delete CarteReseau
    public String DeleteCarteReseau(Long idCarteReseau) {
        CarteReseauRepository.deleteById(idCarteReseau);
        return "CarteReseau Removed !!" + idCarteReseau;
    }

    // UpDate CarteReseau
    // public CarteReseau UpdateCarteReseau(CarteReseau CarteReseau) {
    // CarteReseau existingCarteReseau =
    // CarteReseauRepository.findById(CarteReseau.getIdCarteReseau())
    // .orElse(null);
    // existingCarteReseau.setCarteReseaunom(CarteReseau.getCarteReseaunom());
    // existingCarteReseau.setCarteReseauprenom(CarteReseau.getCarteReseauprenom());
    // existingCarteReseau.setCarteReseauemail(CarteReseau.getCarteReseauemail());
    // existingCarteReseau.setCarteReseaumotdepasse(CarteReseau.getCarteReseaumotdepasse());
    // existingCarteReseau.setCarteReseauadress(CarteReseau.getCarteReseauadress());
    // existingCarteReseau.setCarteReseauntel(CarteReseau.getCarteReseauntel());

    // return CarteReseauRepository.save(existingCarteReseau);
    // }

}
