package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Onduleur;
import fsb.pfe.project.Repository.OnduleurRepository;

public class OnduleurService {
    @Autowired
    private OnduleurRepository OnduleurRepository;

    // Cree un Onduleur
    public Onduleur CreateOnduleur(Onduleur Onduleur) {
        return OnduleurRepository.save(Onduleur);
    }

    // Cree des Onduleurs
    public List<Onduleur> CreateOnduleurs(List<Onduleur> Onduleur) {
        return OnduleurRepository.saveAll(Onduleur);
    }

    // get Onduleurs

    public List<Onduleur> getOnduleurs() {
        return OnduleurRepository.findAll();
    }

    // get Onduleur By Id
    public Onduleur getOnduleurById(Long idOnduleur) {
        return OnduleurRepository.findById(idOnduleur).orElse(null);
    }

    // Delete Onduleur
    public String DeleteOnduleur(Long idOnduleur) {
        OnduleurRepository.deleteById(idOnduleur);
        return "Onduleur Removed !!" + idOnduleur;
    }

    // UpDate Onduleur
    // public Onduleur UpdateOnduleur(Onduleur Onduleur) {
    // Onduleur existingOnduleur =
    // OnduleurRepository.findById(Onduleur.getIdOnduleur())
    // .orElse(null);
    // existingOnduleur.setOnduleurnom(Onduleur.getOnduleurnom());
    // existingOnduleur.setOnduleurprenom(Onduleur.getOnduleurprenom());
    // existingOnduleur.setOnduleuremail(Onduleur.getOnduleuremail());
    // existingOnduleur.setOnduleurmotdepasse(Onduleur.getOnduleurmotdepasse());
    // existingOnduleur.setOnduleuradress(Onduleur.getOnduleuradress());
    // existingOnduleur.setOnduleurntel(Onduleur.getOnduleurntel());

    // return OnduleurRepository.save(existingOnduleur);
    // }

}
