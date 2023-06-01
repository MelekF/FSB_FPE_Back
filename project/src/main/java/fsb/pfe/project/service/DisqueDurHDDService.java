package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.DisqueDurHDD;
import fsb.pfe.project.Repository.DisqueDurHDDRepository;

public class DisqueDurHDDService {
    @Autowired
    private DisqueDurHDDRepository DisqueDurHDDRepository;

    // Cree un DisqueDurHDD
    public DisqueDurHDD CreateDisqueDurHDD(DisqueDurHDD DisqueDurHDD) {
        return DisqueDurHDDRepository.save(DisqueDurHDD);
    }

    // Cree des DisqueDurHDDs
    public List<DisqueDurHDD> CreateDisqueDurHDDs(List<DisqueDurHDD> DisqueDurHDD) {
        return DisqueDurHDDRepository.saveAll(DisqueDurHDD);
    }

    // get DisqueDurHDDs

    public List<DisqueDurHDD> getDisqueDurHDDs() {
        return DisqueDurHDDRepository.findAll();
    }

    // get DisqueDurHDD By Id
    public DisqueDurHDD getDisqueDurHDDById(Long idDisqueDurHDD) {
        return DisqueDurHDDRepository.findById(idDisqueDurHDD).orElse(null);
    }

    // Delete DisqueDurHDD
    public String DeleteDisqueDurHDD(Long idDisqueDurHDD) {
        DisqueDurHDDRepository.deleteById(idDisqueDurHDD);
        return "DisqueDurHDD Removed !!" + idDisqueDurHDD;
    }

    // UpDate DisqueDurHDD
    // public DisqueDurHDD UpdateDisqueDurHDD(DisqueDurHDD DisqueDurHDD) {
    // DisqueDurHDD existingDisqueDurHDD =
    // DisqueDurHDDRepository.findById(DisqueDurHDD.getIdDisqueDurHDD())
    // .orElse(null);
    // existingDisqueDurHDD.setDisqueDurHDDnom(DisqueDurHDD.getDisqueDurHDDnom());
    // existingDisqueDurHDD.setDisqueDurHDDprenom(DisqueDurHDD.getDisqueDurHDDprenom());
    // existingDisqueDurHDD.setDisqueDurHDDemail(DisqueDurHDD.getDisqueDurHDDemail());
    // existingDisqueDurHDD.setDisqueDurHDDmotdepasse(DisqueDurHDD.getDisqueDurHDDmotdepasse());
    // existingDisqueDurHDD.setDisqueDurHDDadress(DisqueDurHDD.getDisqueDurHDDadress());
    // existingDisqueDurHDD.setDisqueDurHDDntel(DisqueDurHDD.getDisqueDurHDDntel());

    // return DisqueDurHDDRepository.save(existingDisqueDurHDD);
    // }

}
