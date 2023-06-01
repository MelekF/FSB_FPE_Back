package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CableHDMI;
import fsb.pfe.project.Repository.CableHDMIRepository;

public class CableHDMIService {
    @Autowired
    private CableHDMIRepository CableHDMIRepository;

    // Cree un CableHDMI
    public CableHDMI CreateCableHDMI(CableHDMI CableHDMI) {
        return CableHDMIRepository.save(CableHDMI);
    }

    // Cree des CableHDMIs
    public List<CableHDMI> CreateCableHDMIs(List<CableHDMI> CableHDMI) {
        return CableHDMIRepository.saveAll(CableHDMI);
    }

    // get CableHDMIs

    public List<CableHDMI> getCableHDMIs() {
        return CableHDMIRepository.findAll();
    }

    // get CableHDMI By Id
    public CableHDMI getCableHDMIById(Long idCableHDMI) {
        return CableHDMIRepository.findById(idCableHDMI).orElse(null);
    }

    // Delete CableHDMI
    public String DeleteCableHDMI(Long idCableHDMI) {
        CableHDMIRepository.deleteById(idCableHDMI);
        return "CableHDMI Removed !!" + idCableHDMI;
    }

    // UpDate CableHDMI
    // public CableHDMI UpdateCableHDMI(CableHDMI CableHDMI) {
    // CableHDMI existingCableHDMI =
    // CableHDMIRepository.findById(CableHDMI.getIdCableHDMI())
    // .orElse(null);
    // existingCableHDMI.setCableHDMInom(CableHDMI.getCableHDMInom());
    // existingCableHDMI.setCableHDMIprenom(CableHDMI.getCableHDMIprenom());
    // existingCableHDMI.setCableHDMIemail(CableHDMI.getCableHDMIemail());
    // existingCableHDMI.setCableHDMImotdepasse(CableHDMI.getCableHDMImotdepasse());
    // existingCableHDMI.setCableHDMIadress(CableHDMI.getCableHDMIadress());
    // existingCableHDMI.setCableHDMIntel(CableHDMI.getCableHDMIntel());

    // return CableHDMIRepository.save(existingCableHDMI);
    // }

}
