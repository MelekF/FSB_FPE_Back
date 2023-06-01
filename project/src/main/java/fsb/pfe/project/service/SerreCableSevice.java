package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.SerreCable;
import fsb.pfe.project.Repository.SerreCableRepository;

public class SerreCableSevice {
    @Autowired
    private SerreCableRepository SerreCableRepository;

    // Cree un SerreCable
    public SerreCable CreateSerreCable(SerreCable SerreCable) {
        return SerreCableRepository.save(SerreCable);
    }

    // Cree des SerreCables
    public List<SerreCable> CreateSerreCables(List<SerreCable> SerreCable) {
        return SerreCableRepository.saveAll(SerreCable);
    }

    // get SerreCables

    public List<SerreCable> getSerreCables() {
        return SerreCableRepository.findAll();
    }

    // get SerreCable By Id
    public SerreCable getSerreCableById(Long idSerreCable) {
        return SerreCableRepository.findById(idSerreCable).orElse(null);
    }

    // Delete SerreCable
    public String DeleteSerreCable(Long idSerreCable) {
        SerreCableRepository.deleteById(idSerreCable);
        return "SerreCable Removed !!" + idSerreCable;
    }

    // UpDate SerreCable
    // public SerreCable UpdateSerreCable(SerreCable SerreCable) {
    // SerreCable existingSerreCable =
    // SerreCableRepository.findById(SerreCable.getIdSerreCable())
    // .orElse(null);
    // existingSerreCable.setSerreCablenom(SerreCable.getSerreCablenom());
    // existingSerreCable.setSerreCableprenom(SerreCable.getSerreCableprenom());
    // existingSerreCable.setSerreCableemail(SerreCable.getSerreCableemail());
    // existingSerreCable.setSerreCablemotdepasse(SerreCable.getSerreCablemotdepasse());
    // existingSerreCable.setSerreCableadress(SerreCable.getSerreCableadress());
    // existingSerreCable.setSerreCablentel(SerreCable.getSerreCablentel());

    // return SerreCableRepository.save(existingSerreCable);
    // }

}
