package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.BaretteMemoire;
import fsb.pfe.project.Repository.BaretteMemoireRepository;

public class BaretteMemoireService {
    @Autowired
    private BaretteMemoireRepository BaretteMemoireRepository;

    // Cree un BaretteMemoire
    public BaretteMemoire CreateBaretteMemoire(BaretteMemoire BaretteMemoire) {
        return BaretteMemoireRepository.save(BaretteMemoire);
    }

    // Cree des BaretteMemoires
    public List<BaretteMemoire> CreateBaretteMemoires(List<BaretteMemoire> BaretteMemoire) {
        return BaretteMemoireRepository.saveAll(BaretteMemoire);
    }

    // get BaretteMemoires

    public List<BaretteMemoire> getBaretteMemoires() {
        return BaretteMemoireRepository.findAll();
    }

    // get BaretteMemoire By Id
    public BaretteMemoire getBaretteMemoireById(Long idBaretteMemoire) {
        return BaretteMemoireRepository.findById(idBaretteMemoire).orElse(null);
    }

    // Delete BaretteMemoire
    public String DeleteBaretteMemoire(Long idBaretteMemoire) {
        BaretteMemoireRepository.deleteById(idBaretteMemoire);
        return "BaretteMemoire Removed !!" + idBaretteMemoire;
    }

    // UpDate BaretteMemoire
    // public BaretteMemoire UpdateBaretteMemoire(BaretteMemoire BaretteMemoire) {
    // BaretteMemoire existingBaretteMemoire =
    // BaretteMemoireRepository.findById(BaretteMemoire.getIdBaretteMemoire())
    // .orElse(null);
    // existingBaretteMemoire.setBaretteMemoirenom(BaretteMemoire.getBaretteMemoirenom());
    // existingBaretteMemoire.setBaretteMemoireprenom(BaretteMemoire.getBaretteMemoireprenom());
    // existingBaretteMemoire.setBaretteMemoireemail(BaretteMemoire.getBaretteMemoireemail());
    // existingBaretteMemoire.setBaretteMemoiremotdepasse(BaretteMemoire.getBaretteMemoiremotdepasse());
    // existingBaretteMemoire.setBaretteMemoireadress(BaretteMemoire.getBaretteMemoireadress());
    // existingBaretteMemoire.setBaretteMemoirentel(BaretteMemoire.getBaretteMemoirentel());

    // return BaretteMemoireRepository.save(existingBaretteMemoire);
    // }

}
