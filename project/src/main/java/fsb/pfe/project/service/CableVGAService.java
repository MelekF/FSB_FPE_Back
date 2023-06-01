package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.CableVGA;
import fsb.pfe.project.Repository.CableVGARepository;

public class CableVGAService {
    @Autowired
    private CableVGARepository CableVGARepository;

    // Cree un CableVGA
    public CableVGA CreateCableVGA(CableVGA CableVGA) {
        return CableVGARepository.save(CableVGA);
    }

    // Cree des CableVGAs
    public List<CableVGA> CreateCableVGAs(List<CableVGA> CableVGA) {
        return CableVGARepository.saveAll(CableVGA);
    }

    // get CableVGAs

    public List<CableVGA> getCableVGAs() {
        return CableVGARepository.findAll();
    }

    // get CableVGA By Id
    public CableVGA getCableVGAById(Long idCableVGA) {
        return CableVGARepository.findById(idCableVGA).orElse(null);
    }

    // Delete CableVGA
    public String DeleteCableVGA(Long idCableVGA) {
        CableVGARepository.deleteById(idCableVGA);
        return "CableVGA Removed !!" + idCableVGA;
    }

    // UpDate CableVGA
    // public CableVGA UpdateCableVGA(CableVGA CableVGA) {
    // CableVGA existingCableVGA =
    // CableVGARepository.findById(CableVGA.getIdCableVGA())
    // .orElse(null);
    // existingCableVGA.setCableVGAnom(CableVGA.getCableVGAnom());
    // existingCableVGA.setCableVGAprenom(CableVGA.getCableVGAprenom());
    // existingCableVGA.setCableVGAemail(CableVGA.getCableVGAemail());
    // existingCableVGA.setCableVGAmotdepasse(CableVGA.getCableVGAmotdepasse());
    // existingCableVGA.setCableVGAadress(CableVGA.getCableVGAadress());
    // existingCableVGA.setCableVGAntel(CableVGA.getCableVGAntel());

    // return CableVGARepository.save(existingCableVGA);
    // }

}
