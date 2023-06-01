package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Climatiseur;
import fsb.pfe.project.Repository.ClimatiseurRepository;

public class ClimatiseurService {
    @Autowired
    private ClimatiseurRepository ClimatiseurRepository;

    // Cree un Climatiseur
    public Climatiseur CreateClimatiseur(Climatiseur Climatiseur) {
        return ClimatiseurRepository.save(Climatiseur);
    }

    // Cree des Climatiseurs
    public List<Climatiseur> CreateClimatiseurs(List<Climatiseur> Climatiseur) {
        return ClimatiseurRepository.saveAll(Climatiseur);
    }

    // get Climatiseurs

    public List<Climatiseur> getClimatiseurs() {
        return ClimatiseurRepository.findAll();
    }

    // get Climatiseur By Id
    public Climatiseur getClimatiseurById(Long idClimatiseur) {
        return ClimatiseurRepository.findById(idClimatiseur).orElse(null);
    }

    // Delete Climatiseur
    public String DeleteClimatiseur(Long idClimatiseur) {
        ClimatiseurRepository.deleteById(idClimatiseur);
        return "Climatiseur Removed !!" + idClimatiseur;
    }

    // UpDate Climatiseur
    // public Climatiseur UpdateClimatiseur(Climatiseur Climatiseur) {
    // Climatiseur existingClimatiseur =
    // ClimatiseurRepository.findById(Climatiseur.getIdClimatiseur())
    // .orElse(null);
    // existingClimatiseur.setClimatiseurnom(Climatiseur.getClimatiseurnom());
    // existingClimatiseur.setClimatiseurprenom(Climatiseur.getClimatiseurprenom());
    // existingClimatiseur.setClimatiseuremail(Climatiseur.getClimatiseuremail());
    // existingClimatiseur.setClimatiseurmotdepasse(Climatiseur.getClimatiseurmotdepasse());
    // existingClimatiseur.setClimatiseuradress(Climatiseur.getClimatiseuradress());
    // existingClimatiseur.setClimatiseurntel(Climatiseur.getClimatiseurntel());

    // return ClimatiseurRepository.save(existingClimatiseur);
    // }

}
