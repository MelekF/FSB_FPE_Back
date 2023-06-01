package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Ventilateur;
import fsb.pfe.project.Repository.VentilateurRepository;

public class VentilateurService {
    @Autowired
    private VentilateurRepository VentilateurRepository;

    // Cree un Ventilateur
    public Ventilateur CreateVentilateur(Ventilateur Ventilateur) {
        return VentilateurRepository.save(Ventilateur);
    }

    // Cree des Ventilateurs
    public List<Ventilateur> CreateVentilateurs(List<Ventilateur> Ventilateur) {
        return VentilateurRepository.saveAll(Ventilateur);
    }

    // get Ventilateurs

    public List<Ventilateur> getVentilateurs() {
        return VentilateurRepository.findAll();
    }

    // get Ventilateur By Id
    public Ventilateur getVentilateurById(Long idVentilateur) {
        return VentilateurRepository.findById(idVentilateur).orElse(null);
    }

    // Delete Ventilateur
    public String DeleteVentilateur(Long idVentilateur) {
        VentilateurRepository.deleteById(idVentilateur);
        return "Ventilateur Removed !!" + idVentilateur;
    }

    // UpDate Ventilateur
    // public Ventilateur UpdateVentilateur(Ventilateur Ventilateur) {
    // Ventilateur existingVentilateur =
    // VentilateurRepository.findById(Ventilateur.getIdVentilateur())
    // .orElse(null);
    // existingVentilateur.setVentilateurnom(Ventilateur.getVentilateurnom());
    // existingVentilateur.setVentilateurprenom(Ventilateur.getVentilateurprenom());
    // existingVentilateur.setVentilateuremail(Ventilateur.getVentilateuremail());
    // existingVentilateur.setVentilateurmotdepasse(Ventilateur.getVentilateurmotdepasse());
    // existingVentilateur.setVentilateuradress(Ventilateur.getVentilateuradress());
    // existingVentilateur.setVentilateurntel(Ventilateur.getVentilateurntel());

    // return VentilateurRepository.save(existingVentilateur);
    // }

}
