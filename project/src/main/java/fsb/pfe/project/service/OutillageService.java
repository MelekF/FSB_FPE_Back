package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Outillage;
import fsb.pfe.project.Repository.OutillageRepository;

public class OutillageService {
    @Autowired
    private OutillageRepository OutillageRepository;

    // Cree un Outillage
    public Outillage CreateOutillage(Outillage Outillage) {
        return OutillageRepository.save(Outillage);
    }

    // Cree des Outillages
    public List<Outillage> CreateOutillages(List<Outillage> Outillage) {
        return OutillageRepository.saveAll(Outillage);
    }

    // get Outillages

    public List<Outillage> getOutillages() {
        return OutillageRepository.findAll();
    }

    // get Outillage By Id
    public Outillage getOutillageById(Long idOutillage) {
        return OutillageRepository.findById(idOutillage).orElse(null);
    }

    // Delete Outillage
    public String DeleteOutillage(Long idOutillage) {
        OutillageRepository.deleteById(idOutillage);
        return "Outillage Removed !!" + idOutillage;
    }

    // UpDate Outillage
    // public Outillage UpdateOutillage(Outillage Outillage) {
    // Outillage existingOutillage =
    // OutillageRepository.findById(Outillage.getIdOutillage())
    // .orElse(null);
    // existingOutillage.setOutillagenom(Outillage.getOutillagenom());
    // existingOutillage.setOutillageprenom(Outillage.getOutillageprenom());
    // existingOutillage.setOutillageemail(Outillage.getOutillageemail());
    // existingOutillage.setOutillagemotdepasse(Outillage.getOutillagemotdepasse());
    // existingOutillage.setOutillageadress(Outillage.getOutillageadress());
    // existingOutillage.setOutillagentel(Outillage.getOutillagentel());

    // return OutillageRepository.save(existingOutillage);
    // }

}
