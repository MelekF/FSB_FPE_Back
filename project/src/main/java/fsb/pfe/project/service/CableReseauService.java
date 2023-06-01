package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CableReseau;
import fsb.pfe.project.Repository.CableReseauRepository;

public class CableReseauService {
    @Autowired
    private CableReseauRepository CableReseauRepository;

    // Cree un CableReseau
    public CableReseau CreateCableReseau(CableReseau CableReseau) {
        return CableReseauRepository.save(CableReseau);
    }

    // Cree des CableReseaus
    public List<CableReseau> CreateCableReseaus(List<CableReseau> CableReseau) {
        return CableReseauRepository.saveAll(CableReseau);
    }

    // get CableReseaus

    public List<CableReseau> getCableReseaus() {
        return CableReseauRepository.findAll();
    }

    // get CableReseau By Id
    public CableReseau getCableReseauById(Long idCableReseau) {
        return CableReseauRepository.findById(idCableReseau).orElse(null);
    }

    // Delete CableReseau
    public String DeleteCableReseau(Long idCableReseau) {
        CableReseauRepository.deleteById(idCableReseau);
        return "CableReseau Removed !!" + idCableReseau;
    }

    // UpDate CableReseau
    // public CableReseau UpdateCableReseau(CableReseau CableReseau) {
    // CableReseau existingCableReseau =
    // CableReseauRepository.findById(CableReseau.getIdCableReseau())
    // .orElse(null);
    // existingCableReseau.setCableReseaunom(CableReseau.getCableReseaunom());
    // existingCableReseau.setCableReseauprenom(CableReseau.getCableReseauprenom());
    // existingCableReseau.setCableReseauemail(CableReseau.getCableReseauemail());
    // existingCableReseau.setCableReseaumotdepasse(CableReseau.getCableReseaumotdepasse());
    // existingCableReseau.setCableReseauadress(CableReseau.getCableReseauadress());
    // existingCableReseau.setCableReseauntel(CableReseau.getCableReseauntel());

    // return CableReseauRepository.save(existingCableReseau);
    // }

}
