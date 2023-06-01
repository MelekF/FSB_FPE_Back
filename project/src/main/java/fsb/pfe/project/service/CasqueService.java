package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Casque;
import fsb.pfe.project.Repository.CasqueRepository;

public class CasqueService {
    @Autowired
    private CasqueRepository CasqueRepository;

    // Cree un Casque
    public Casque CreateCasque(Casque Casque) {
        return CasqueRepository.save(Casque);
    }

    // Cree des Casques
    public List<Casque> CreateCasques(List<Casque> Casque) {
        return CasqueRepository.saveAll(Casque);
    }

    // get Casques

    public List<Casque> getCasques() {
        return CasqueRepository.findAll();
    }

    // get Casque By Id
    public Casque getCasqueById(Long idCasque) {
        return CasqueRepository.findById(idCasque).orElse(null);
    }

    // Delete Casque
    public String DeleteCasque(Long idCasque) {
        CasqueRepository.deleteById(idCasque);
        return "Casque Removed !!" + idCasque;
    }

    // UpDate Casque
    // public Casque UpdateCasque(Casque Casque) {
    // Casque existingCasque =
    // CasqueRepository.findById(Casque.getIdCasque())
    // .orElse(null);
    // existingCasque.setCasquenom(Casque.getCasquenom());
    // existingCasque.setCasqueprenom(Casque.getCasqueprenom());
    // existingCasque.setCasqueemail(Casque.getCasqueemail());
    // existingCasque.setCasquemotdepasse(Casque.getCasquemotdepasse());
    // existingCasque.setCasqueadress(Casque.getCasqueadress());
    // existingCasque.setCasquentel(Casque.getCasquentel());

    // return CasqueRepository.save(existingCasque);
    // }

}
