package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Pile;
import fsb.pfe.project.Repository.PileRepository;

public class PileService {
    @Autowired
    private PileRepository PileRepository;

    // Cree un Pile
    public Pile CreatePile(Pile Pile) {
        return PileRepository.save(Pile);
    }

    // Cree des Piles
    public List<Pile> CreatePiles(List<Pile> Pile) {
        return PileRepository.saveAll(Pile);
    }

    // get Piles

    public List<Pile> getPiles() {
        return PileRepository.findAll();
    }

    // get Pile By Id
    public Pile getPileById(Long idPile) {
        return PileRepository.findById(idPile).orElse(null);
    }

    // Delete Pile
    public String DeletePile(Long idPile) {
        PileRepository.deleteById(idPile);
        return "Pile Removed !!" + idPile;
    }

    // UpDate Pile
    // public Pile UpdatePile(Pile Pile) {
    // Pile existingPile =
    // PileRepository.findById(Pile.getIdPile())
    // .orElse(null);
    // existingPile.setPilenom(Pile.getPilenom());
    // existingPile.setPileprenom(Pile.getPileprenom());
    // existingPile.setPileemail(Pile.getPileemail());
    // existingPile.setPilemotdepasse(Pile.getPilemotdepasse());
    // existingPile.setPileadress(Pile.getPileadress());
    // existingPile.setPilentel(Pile.getPilentel());

    // return PileRepository.save(existingPile);
    // }

}
