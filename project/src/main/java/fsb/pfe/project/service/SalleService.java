package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Salle;
import fsb.pfe.project.Repository.SalleRepository;

public class SalleService {

    @Autowired
    private SalleRepository SalleRepository;

    // Cree un Salle (Admin Only)
    public Salle CreateSalle(Salle Salle) {
        return SalleRepository.save(Salle);
    }

    // Cree des Salles (Admin Only)
    public List<Salle> CreateSalles(List<Salle> Salle) {
        return SalleRepository.saveAll(Salle);
    }

    // get Salles

    public List<Salle> getSalles() {
        return SalleRepository.findAll();
    }

    // get Salle By Id
    public Salle getSalleById(Long idSalle) {
        return SalleRepository.findById(idSalle).orElse(null);
    }

    // Delete Salle (Admin Only)
    public String DeleteSalle(Long idSalle) {
        SalleRepository.deleteById(idSalle);
        return "Salle Removed !!" + idSalle;
    }

    // UpDate Salle (Admin Only)
    // public Salle UpdateSalle(Salle Salle) {
    // Salle existingSalle = SalleRepository.findById(Salle.getIdSalle())
    // .orElse(null);
    // existingSalle.setSallenom(Salle.getSallenom());
    // existingSalle.setSalleprenom(Salle.getSalleprenom());
    // existingSalle.setSalleemail(Salle.getSalleemail());
    // existingSalle.setSallemotdepasse(Salle.getSallemotdepasse());
    // existingSalle.setSalleadress(Salle.getSalleadress());
    // existingSalle.setSallentel(Salle.getSallentel());

    // return SalleRepository.save(existingSalle);
    // }
}
