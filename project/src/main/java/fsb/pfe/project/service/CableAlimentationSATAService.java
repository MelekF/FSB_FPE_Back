package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CableAlimentationSATA;
import fsb.pfe.project.Repository.CableAlimentationSATARepository;

public class CableAlimentationSATAService {
    @Autowired
    private CableAlimentationSATARepository CableAlimentationSATARepository;

    // Cree un CableAlimentationSATA
    public CableAlimentationSATA CreateCableAlimentationSATA(CableAlimentationSATA CableAlimentationSATA) {
        return CableAlimentationSATARepository.save(CableAlimentationSATA);
    }

    // Cree des CableAlimentationSATAs
    public List<CableAlimentationSATA> CreateCableAlimentationSATAs(List<CableAlimentationSATA> CableAlimentationSATA) {
        return CableAlimentationSATARepository.saveAll(CableAlimentationSATA);
    }

    // get CableAlimentationSATAs

    public List<CableAlimentationSATA> getCableAlimentationSATAs() {
        return CableAlimentationSATARepository.findAll();
    }

    // get CableAlimentationSATA By Id
    public CableAlimentationSATA getCableAlimentationSATAById(Long idCableAlimentationSATA) {
        return CableAlimentationSATARepository.findById(idCableAlimentationSATA).orElse(null);
    }

    // Delete CableAlimentationSATA
    public String DeleteCableAlimentationSATA(Long idCableAlimentationSATA) {
        CableAlimentationSATARepository.deleteById(idCableAlimentationSATA);
        return "CableAlimentationSATA Removed !!" + idCableAlimentationSATA;
    }

    // UpDate CableAlimentationSATA
    // public CableAlimentationSATA
    // UpdateCableAlimentationSATA(CableAlimentationSATA CableAlimentationSATA) {
    // CableAlimentationSATA existingCableAlimentationSATA =
    // CableAlimentationSATARepository.findById(CableAlimentationSATA.getIdCableAlimentationSATA())
    // .orElse(null);
    // existingCableAlimentationSATA.setCableAlimentationSATAnom(CableAlimentationSATA.getCableAlimentationSATAnom());
    // existingCableAlimentationSATA.setCableAlimentationSATAprenom(CableAlimentationSATA.getCableAlimentationSATAprenom());
    // existingCableAlimentationSATA.setCableAlimentationSATAemail(CableAlimentationSATA.getCableAlimentationSATAemail());
    // existingCableAlimentationSATA.setCableAlimentationSATAmotdepasse(CableAlimentationSATA.getCableAlimentationSATAmotdepasse());
    // existingCableAlimentationSATA.setCableAlimentationSATAadress(CableAlimentationSATA.getCableAlimentationSATAadress());
    // existingCableAlimentationSATA.setCableAlimentationSATAntel(CableAlimentationSATA.getCableAlimentationSATAntel());

    // return CableAlimentationSATARepository.save(existingCableAlimentationSATA);
    // }

}
