package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Soufleur;
import fsb.pfe.project.Repository.SoufleurRepository;

public class SoufleurService {
    @Autowired
    private SoufleurRepository SoufleurRepository;

    // Cree un Soufleur
    public Soufleur CreateSoufleur(Soufleur Soufleur) {
        return SoufleurRepository.save(Soufleur);
    }

    // Cree des Soufleurs
    public List<Soufleur> CreateSoufleurs(List<Soufleur> Soufleur) {
        return SoufleurRepository.saveAll(Soufleur);
    }

    // get Soufleurs

    public List<Soufleur> getSoufleurs() {
        return SoufleurRepository.findAll();
    }

    // get Soufleur By Id
    public Soufleur getSoufleurById(Long idSoufleur) {
        return SoufleurRepository.findById(idSoufleur).orElse(null);
    }

    // Delete Soufleur
    public String DeleteSoufleur(Long idSoufleur) {
        SoufleurRepository.deleteById(idSoufleur);
        return "Soufleur Removed !!" + idSoufleur;
    }

    // UpDate Soufleur
    // public Soufleur UpdateSoufleur(Soufleur Soufleur) {
    // Soufleur existingSoufleur =
    // SoufleurRepository.findById(Soufleur.getIdSoufleur())
    // .orElse(null);
    // existingSoufleur.setSoufleurnom(Soufleur.getSoufleurnom());
    // existingSoufleur.setSoufleurprenom(Soufleur.getSoufleurprenom());
    // existingSoufleur.setSoufleuremail(Soufleur.getSoufleuremail());
    // existingSoufleur.setSoufleurmotdepasse(Soufleur.getSoufleurmotdepasse());
    // existingSoufleur.setSoufleuradress(Soufleur.getSoufleuradress());
    // existingSoufleur.setSoufleurntel(Soufleur.getSoufleurntel());

    // return SoufleurRepository.save(existingSoufleur);
    // }

}
