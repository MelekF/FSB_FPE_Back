package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.BoitierExterne;
import fsb.pfe.project.Repository.BoitierExterneRepository;

public class BoitierExterneService {
    @Autowired
    private BoitierExterneRepository BoitierExterneRepository;

    // Cree un BoitierExterne
    public BoitierExterne CreateBoitierExterne(BoitierExterne BoitierExterne) {
        return BoitierExterneRepository.save(BoitierExterne);
    }

    // Cree des BoitierExternes
    public List<BoitierExterne> CreateBoitierExternes(List<BoitierExterne> BoitierExterne) {
        return BoitierExterneRepository.saveAll(BoitierExterne);
    }

    // get BoitierExternes

    public List<BoitierExterne> getBoitierExternes() {
        return BoitierExterneRepository.findAll();
    }

    // get BoitierExterne By Id
    public BoitierExterne getBoitierExterneById(Long idBoitierExterne) {
        return BoitierExterneRepository.findById(idBoitierExterne).orElse(null);
    }

    // Delete BoitierExterne
    public String DeleteBoitierExterne(Long idBoitierExterne) {
        BoitierExterneRepository.deleteById(idBoitierExterne);
        return "BoitierExterne Removed !!" + idBoitierExterne;
    }

    // UpDate BoitierExterne
    // public BoitierExterne UpdateBoitierExterne(BoitierExterne BoitierExterne) {
    // BoitierExterne existingBoitierExterne =
    // BoitierExterneRepository.findById(BoitierExterne.getIdBoitierExterne())
    // .orElse(null);
    // existingBoitierExterne.setBoitierExternenom(BoitierExterne.getBoitierExternenom());
    // existingBoitierExterne.setBoitierExterneprenom(BoitierExterne.getBoitierExterneprenom());
    // existingBoitierExterne.setBoitierExterneemail(BoitierExterne.getBoitierExterneemail());
    // existingBoitierExterne.setBoitierExternemotdepasse(BoitierExterne.getBoitierExternemotdepasse());
    // existingBoitierExterne.setBoitierExterneadress(BoitierExterne.getBoitierExterneadress());
    // existingBoitierExterne.setBoitierExternentel(BoitierExterne.getBoitierExternentel());

    // return BoitierExterneRepository.save(existingBoitierExterne);
    // }

}
