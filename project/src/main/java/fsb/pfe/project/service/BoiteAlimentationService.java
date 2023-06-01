package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.BoiteAlimentation;
import fsb.pfe.project.Repository.BoiteAlimentationRepository;

public class BoiteAlimentationService {
    @Autowired
    private BoiteAlimentationRepository BoiteAlimentationRepository;

    // Cree un BoiteAlimentation
    public BoiteAlimentation CreateBoiteAlimentation(BoiteAlimentation BoiteAlimentation) {
        return BoiteAlimentationRepository.save(BoiteAlimentation);
    }

    // Cree des BoiteAlimentations
    public List<BoiteAlimentation> CreateBoiteAlimentations(List<BoiteAlimentation> BoiteAlimentation) {
        return BoiteAlimentationRepository.saveAll(BoiteAlimentation);
    }

    // get BoiteAlimentations

    public List<BoiteAlimentation> getBoiteAlimentations() {
        return BoiteAlimentationRepository.findAll();
    }

    // get BoiteAlimentation By Id
    public BoiteAlimentation getBoiteAlimentationById(Long idBoiteAlimentation) {
        return BoiteAlimentationRepository.findById(idBoiteAlimentation).orElse(null);
    }

    // Delete BoiteAlimentation
    public String DeleteBoiteAlimentation(Long idBoiteAlimentation) {
        BoiteAlimentationRepository.deleteById(idBoiteAlimentation);
        return "BoiteAlimentation Removed !!" + idBoiteAlimentation;
    }

    // UpDate BoiteAlimentation
    // public BoiteAlimentation UpdateBoiteAlimentation(BoiteAlimentation
    // BoiteAlimentation) {
    // BoiteAlimentation existingBoiteAlimentation =
    // BoiteAlimentationRepository.findById(BoiteAlimentation.getIdBoiteAlimentation())
    // .orElse(null);
    // existingBoiteAlimentation.setBoiteAlimentationnom(BoiteAlimentation.getBoiteAlimentationnom());
    // existingBoiteAlimentation.setBoiteAlimentationprenom(BoiteAlimentation.getBoiteAlimentationprenom());
    // existingBoiteAlimentation.setBoiteAlimentationemail(BoiteAlimentation.getBoiteAlimentationemail());
    // existingBoiteAlimentation.setBoiteAlimentationmotdepasse(BoiteAlimentation.getBoiteAlimentationmotdepasse());
    // existingBoiteAlimentation.setBoiteAlimentationadress(BoiteAlimentation.getBoiteAlimentationadress());
    // existingBoiteAlimentation.setBoiteAlimentationntel(BoiteAlimentation.getBoiteAlimentationntel());

    // return BoiteAlimentationRepository.save(existingBoiteAlimentation);
    // }

}
