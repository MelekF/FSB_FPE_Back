package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Pc;
import fsb.pfe.project.Repository.PcRepository;

public class PcService {
    @Autowired
    private PcRepository PcRepository;

    // Cree un Pc
    public Pc CreatePc(Pc Pc) {
        return PcRepository.save(Pc);
    }

    // Cree des Pcs
    public List<Pc> CreatePcs(List<Pc> Pc) {
        return PcRepository.saveAll(Pc);
    }

    // get Pcs

    public List<Pc> getPcs() {
        return PcRepository.findAll();
    }

    // get Pc By Id
    public Pc getPcById(Long idPc) {
        return PcRepository.findById(idPc).orElse(null);
    }

    // Delete Pc
    public String DeletePc(Long idPc) {
        PcRepository.deleteById(idPc);
        return "Pc Removed !!" + idPc;
    }

    // UpDate Pc
    // public Pc UpdatePc(Pc Pc) {
    // Pc existingPc =
    // PcRepository.findById(Pc.getIdPc())
    // .orElse(null);
    // existingPc.setPcnom(Pc.getPcnom());
    // existingPc.setPcprenom(Pc.getPcprenom());
    // existingPc.setPcemail(Pc.getPcemail());
    // existingPc.setPcmotdepasse(Pc.getPcmotdepasse());
    // existingPc.setPcadress(Pc.getPcadress());
    // existingPc.setPcntel(Pc.getPcntel());

    // return PcRepository.save(existingPc);
    // }

}
