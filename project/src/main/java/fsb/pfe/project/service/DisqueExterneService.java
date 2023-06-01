package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.DisqueExterne;
import fsb.pfe.project.Repository.DisqueExterneRepository;

public class DisqueExterneService {
    @Autowired
    private DisqueExterneRepository DisqueExterneRepository;

    // Cree un DisqueExterne
    public DisqueExterne CreateDisqueExterne(DisqueExterne DisqueExterne) {
        return DisqueExterneRepository.save(DisqueExterne);
    }

    // Cree des DisqueExternes
    public List<DisqueExterne> CreateDisqueExternes(List<DisqueExterne> DisqueExterne) {
        return DisqueExterneRepository.saveAll(DisqueExterne);
    }

    // get DisqueExternes

    public List<DisqueExterne> getDisqueExternes() {
        return DisqueExterneRepository.findAll();
    }

    // get DisqueExterne By Id
    public DisqueExterne getDisqueExterneById(Long idDisqueExterne) {
        return DisqueExterneRepository.findById(idDisqueExterne).orElse(null);
    }

    // Delete DisqueExterne
    public String DeleteDisqueExterne(Long idDisqueExterne) {
        DisqueExterneRepository.deleteById(idDisqueExterne);
        return "DisqueExterne Removed !!" + idDisqueExterne;
    }

    // UpDate DisqueExterne
    // public DisqueExterne UpdateDisqueExterne(DisqueExterne DisqueExterne) {
    // DisqueExterne existingDisqueExterne =
    // DisqueExterneRepository.findById(DisqueExterne.getIdDisqueExterne())
    // .orElse(null);
    // existingDisqueExterne.setDisqueExternenom(DisqueExterne.getDisqueExternenom());
    // existingDisqueExterne.setDisqueExterneprenom(DisqueExterne.getDisqueExterneprenom());
    // existingDisqueExterne.setDisqueExterneemail(DisqueExterne.getDisqueExterneemail());
    // existingDisqueExterne.setDisqueExternemotdepasse(DisqueExterne.getDisqueExternemotdepasse());
    // existingDisqueExterne.setDisqueExterneadress(DisqueExterne.getDisqueExterneadress());
    // existingDisqueExterne.setDisqueExternentel(DisqueExterne.getDisqueExternentel());

    // return DisqueExterneRepository.save(existingDisqueExterne);
    // }

}
