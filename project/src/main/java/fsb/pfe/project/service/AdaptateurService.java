package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Adaptateur;
import fsb.pfe.project.Repository.AdaptateurRepository;
import org.springframework.stereotype.Service;

@Service
public class AdaptateurService {
    @Autowired
    private AdaptateurRepository AdaptateurRepository;

    // Cree un Adaptateur
    public Adaptateur CreateAdaptateur(Adaptateur Adaptateur) {
        return AdaptateurRepository.save(Adaptateur);
    }

    // Cree des Adaptateurs
    public List<Adaptateur> CreateAdaptateurs(List<Adaptateur> Adaptateur) {
        return AdaptateurRepository.saveAll(Adaptateur);
    }

    // get Adaptateurs

    public List<Adaptateur> getAdaptateurs() {
        return AdaptateurRepository.findAll();
    }

    // get Adaptateur By Id
    public Adaptateur getAdaptateurById(Long idAdaptateur) {
        return AdaptateurRepository.findById(idAdaptateur).orElse(null);
    }

    // Delete Adaptateur
    public String DeleteAdaptateur(Long idAdaptateur) {
        AdaptateurRepository.deleteById(idAdaptateur);
        return "Adaptateur Removed !!" + idAdaptateur;
    }

    // UpDate Adaptateur
    // public Adaptateur UpdateAdaptateur(Adaptateur Adaptateur) {
    // Adaptateur existingAdaptateur =
    // AdaptateurRepository.findById(Adaptateur.getIdAdaptateur())
    // .orElse(null);
    // existingAdaptateur.setAdaptateurnom(Adaptateur.getAdaptateurnom());
    // existingAdaptateur.setAdaptateurprenom(Adaptateur.getAdaptateurprenom());
    // existingAdaptateur.setAdaptateuremail(Adaptateur.getAdaptateuremail());
    // existingAdaptateur.setAdaptateurmotdepasse(Adaptateur.getAdaptateurmotdepasse());
    // existingAdaptateur.setAdaptateuradress(Adaptateur.getAdaptateuradress());
    // existingAdaptateur.setAdaptateurntel(Adaptateur.getAdaptateurntel());

    // return AdaptateurRepository.save(existingAdaptateur);
    // }

}
