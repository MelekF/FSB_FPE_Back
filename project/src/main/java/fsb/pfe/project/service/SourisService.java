package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Souris;
import fsb.pfe.project.Repository.SourisRepository;

public class SourisService {
    @Autowired
    private SourisRepository SourisRepository;

    // Cree un Souris
    public Souris CreateSouris(Souris Souris) {
        return SourisRepository.save(Souris);
    }

    // Cree des Souriss
    public List<Souris> CreateSouriss(List<Souris> Souris) {
        return SourisRepository.saveAll(Souris);
    }

    // get Souriss

    public List<Souris> getSouriss() {
        return SourisRepository.findAll();
    }

    // get Souris By Id
    public Souris getSourisById(Long idSouris) {
        return SourisRepository.findById(idSouris).orElse(null);
    }

    // Delete Souris
    public String DeleteSouris(Long idSouris) {
        SourisRepository.deleteById(idSouris);
        return "Souris Removed !!" + idSouris;
    }

    // UpDate Souris
    // public Souris UpdateSouris(Souris Souris) {
    // Souris existingSouris =
    // SourisRepository.findById(Souris.getIdSouris())
    // .orElse(null);
    // existingSouris.setSourisnom(Souris.getSourisnom());
    // existingSouris.setSourisprenom(Souris.getSourisprenom());
    // existingSouris.setSourisemail(Souris.getSourisemail());
    // existingSouris.setSourismotdepasse(Souris.getSourismotdepasse());
    // existingSouris.setSourisadress(Souris.getSourisadress());
    // existingSouris.setSourisntel(Souris.getSourisntel());

    // return SourisRepository.save(existingSouris);
    // }

}
