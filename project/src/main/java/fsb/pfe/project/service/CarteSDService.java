package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CarteSD;
import fsb.pfe.project.Repository.CarteSDRepository;

public class CarteSDService {
    @Autowired
    private CarteSDRepository CarteSDRepository;

    // Cree un CarteSD
    public CarteSD CreateCarteSD(CarteSD CarteSD) {
        return CarteSDRepository.save(CarteSD);
    }

    // Cree des CarteSDs
    public List<CarteSD> CreateCarteSDs(List<CarteSD> CarteSD) {
        return CarteSDRepository.saveAll(CarteSD);
    }

    // get CarteSDs

    public List<CarteSD> getCarteSDs() {
        return CarteSDRepository.findAll();
    }

    // get CarteSD By Id
    public CarteSD getCarteSDById(Long idCarteSD) {
        return CarteSDRepository.findById(idCarteSD).orElse(null);
    }

    // Delete CarteSD
    public String DeleteCarteSD(Long idCarteSD) {
        CarteSDRepository.deleteById(idCarteSD);
        return "CarteSD Removed !!" + idCarteSD;
    }

    // UpDate CarteSD
    // public CarteSD UpdateCarteSD(CarteSD CarteSD) {
    // CarteSD existingCarteSD =
    // CarteSDRepository.findById(CarteSD.getIdCarteSD())
    // .orElse(null);
    // existingCarteSD.setCarteSDnom(CarteSD.getCarteSDnom());
    // existingCarteSD.setCarteSDprenom(CarteSD.getCarteSDprenom());
    // existingCarteSD.setCarteSDemail(CarteSD.getCarteSDemail());
    // existingCarteSD.setCarteSDmotdepasse(CarteSD.getCarteSDmotdepasse());
    // existingCarteSD.setCarteSDadress(CarteSD.getCarteSDadress());
    // existingCarteSD.setCarteSDntel(CarteSD.getCarteSDntel());

    // return CarteSDRepository.save(existingCarteSD);
    // }

}
