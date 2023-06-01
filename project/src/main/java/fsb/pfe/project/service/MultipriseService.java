package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Multiprise;
import fsb.pfe.project.Repository.MultipriseRepository;

public class MultipriseService {
    @Autowired
    private MultipriseRepository MultipriseRepository;

    // Cree un Multiprise
    public Multiprise CreateMultiprise(Multiprise Multiprise) {
        return MultipriseRepository.save(Multiprise);
    }

    // Cree des Multiprises
    public List<Multiprise> CreateMultiprises(List<Multiprise> Multiprise) {
        return MultipriseRepository.saveAll(Multiprise);
    }

    // get Multiprises

    public List<Multiprise> getMultiprises() {
        return MultipriseRepository.findAll();
    }

    // get Multiprise By Id
    public Multiprise getMultipriseById(Long idMultiprise) {
        return MultipriseRepository.findById(idMultiprise).orElse(null);
    }

    // Delete Multiprise
    public String DeleteMultiprise(Long idMultiprise) {
        MultipriseRepository.deleteById(idMultiprise);
        return "Multiprise Removed !!" + idMultiprise;
    }

    // UpDate Multiprise
    // public Multiprise UpdateMultiprise(Multiprise Multiprise) {
    // Multiprise existingMultiprise =
    // MultipriseRepository.findById(Multiprise.getIdMultiprise())
    // .orElse(null);
    // existingMultiprise.setMultiprisenom(Multiprise.getMultiprisenom());
    // existingMultiprise.setMultipriseprenom(Multiprise.getMultipriseprenom());
    // existingMultiprise.setMultipriseemail(Multiprise.getMultipriseemail());
    // existingMultiprise.setMultiprisemotdepasse(Multiprise.getMultiprisemotdepasse());
    // existingMultiprise.setMultipriseadress(Multiprise.getMultipriseadress());
    // existingMultiprise.setMultiprisentel(Multiprise.getMultiprisentel());

    // return MultipriseRepository.save(existingMultiprise);
    // }

}
