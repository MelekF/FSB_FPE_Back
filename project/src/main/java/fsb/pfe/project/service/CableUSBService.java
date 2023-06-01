package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CableUSB;
import fsb.pfe.project.Repository.CableUSBRepository;

public class CableUSBService {
    @Autowired
    private CableUSBRepository CableUSBRepository;

    // Cree un CableUSB
    public CableUSB CreateCableUSB(CableUSB CableUSB) {
        return CableUSBRepository.save(CableUSB);
    }

    // Cree des CableUSBs
    public List<CableUSB> CreateCableUSBs(List<CableUSB> CableUSB) {
        return CableUSBRepository.saveAll(CableUSB);
    }

    // get CableUSBs

    public List<CableUSB> getCableUSBs() {
        return CableUSBRepository.findAll();
    }

    // get CableUSB By Id
    public CableUSB getCableUSBById(Long idCableUSB) {
        return CableUSBRepository.findById(idCableUSB).orElse(null);
    }

    // Delete CableUSB
    public String DeleteCableUSB(Long idCableUSB) {
        CableUSBRepository.deleteById(idCableUSB);
        return "CableUSB Removed !!" + idCableUSB;
    }

    // UpDate CableUSB
    // public CableUSB UpdateCableUSB(CableUSB CableUSB) {
    // CableUSB existingCableUSB =
    // CableUSBRepository.findById(CableUSB.getIdCableUSB())
    // .orElse(null);
    // existingCableUSB.setCableUSBnom(CableUSB.getCableUSBnom());
    // existingCableUSB.setCableUSBprenom(CableUSB.getCableUSBprenom());
    // existingCableUSB.setCableUSBemail(CableUSB.getCableUSBemail());
    // existingCableUSB.setCableUSBmotdepasse(CableUSB.getCableUSBmotdepasse());
    // existingCableUSB.setCableUSBadress(CableUSB.getCableUSBadress());
    // existingCableUSB.setCableUSBntel(CableUSB.getCableUSBntel());

    // return CableUSBRepository.save(existingCableUSB);
    // }

}
