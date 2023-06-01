package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Clavier;
import fsb.pfe.project.Repository.ClavierRepository;

public class ClavierService {
    @Autowired
    private ClavierRepository ClavierRepository;

    // Cree un Clavier
    public Clavier CreateClavier(Clavier Clavier) {
        return ClavierRepository.save(Clavier);
    }

    // Cree des Claviers
    public List<Clavier> CreateClaviers(List<Clavier> Clavier) {
        return ClavierRepository.saveAll(Clavier);
    }

    // get Claviers

    public List<Clavier> getClaviers() {
        return ClavierRepository.findAll();
    }

    // get Clavier By Id
    public Clavier getClavierById(Long idClavier) {
        return ClavierRepository.findById(idClavier).orElse(null);
    }

    // Delete Clavier
    public String DeleteClavier(Long idClavier) {
        ClavierRepository.deleteById(idClavier);
        return "Clavier Removed !!" + idClavier;
    }

    // UpDate Clavier
    // public Clavier UpdateClavier(Clavier Clavier) {
    // Clavier existingClavier =
    // ClavierRepository.findById(Clavier.getIdClavier())
    // .orElse(null);
    // existingClavier.setClaviernom(Clavier.getClaviernom());
    // existingClavier.setClavierprenom(Clavier.getClavierprenom());
    // existingClavier.setClavieremail(Clavier.getClavieremail());
    // existingClavier.setClaviermotdepasse(Clavier.getClaviermotdepasse());
    // existingClavier.setClavieradress(Clavier.getClavieradress());
    // existingClavier.setClavierntel(Clavier.getClavierntel());

    // return ClavierRepository.save(existingClavier);
    // }

}
