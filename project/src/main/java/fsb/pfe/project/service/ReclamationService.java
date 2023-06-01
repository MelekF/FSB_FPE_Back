package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsb.pfe.project.Model.Reclamation;
import fsb.pfe.project.Repository.ReclamationRepository;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationRepository ReclamationRepository;

    // Cree un Reclamation
    public Reclamation CreateReclamation(Reclamation Reclamation) {
        return ReclamationRepository.save(Reclamation);
    }

    // Cree des Reclamations
    public List<Reclamation> CreateReclamations(List<Reclamation> Reclamation) {
        return ReclamationRepository.saveAll(Reclamation);
    }

    // get Reclamations

    public List<Reclamation> getReclamations() {
        return ReclamationRepository.findAll();
    }

    // get Reclamation By Id
    public Reclamation getReclamationById(Long idReclamation) {
        return ReclamationRepository.findById(idReclamation).orElse(null);
    }

    // Delete Reclamation
    public String DeleteReclamation(Long idReclamation) {
        ReclamationRepository.deleteById(idReclamation);
        return "Reclamation Removed !!" + idReclamation;
    }

    // UpDate Reclamation
    // public Reclamation UpdateReclamation(Reclamation Reclamation) {
    // Reclamation existingReclamation =
    // ReclamationRepository.findById(Reclamation.getIdReclamation())
    // .orElse(null);
    // existingReclamation.setReclamationnom(Reclamation.getReclamationnom());
    // existingReclamation.setReclamationprenom(Reclamation.getReclamationprenom());
    // existingReclamation.setReclamationemail(Reclamation.getReclamationemail());
    // existingReclamation.setReclamationmotdepasse(Reclamation.getReclamationmotdepasse());
    // existingReclamation.setReclamationadress(Reclamation.getReclamationadress());
    // existingReclamation.setReclamationntel(Reclamation.getReclamationntel());

    // return ReclamationRepository.save(existingReclamation);
    // }

}
