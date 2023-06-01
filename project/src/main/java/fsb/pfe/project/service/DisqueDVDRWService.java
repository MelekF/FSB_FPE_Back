package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.DisqueDVDRW;
import fsb.pfe.project.Repository.DisqueDVDRWRepository;

public class DisqueDVDRWService {
    @Autowired
    private DisqueDVDRWRepository DisqueDVDRWRepository;

    // Cree un DisqueDVDRW
    public DisqueDVDRW CreateDisqueDVDRW(DisqueDVDRW DisqueDVDRW) {
        return DisqueDVDRWRepository.save(DisqueDVDRW);
    }

    // Cree des DisqueDVDRWs
    public List<DisqueDVDRW> CreateDisqueDVDRWs(List<DisqueDVDRW> DisqueDVDRW) {
        return DisqueDVDRWRepository.saveAll(DisqueDVDRW);
    }

    // get DisqueDVDRWs

    public List<DisqueDVDRW> getDisqueDVDRWs() {
        return DisqueDVDRWRepository.findAll();
    }

    // get DisqueDVDRW By Id
    public DisqueDVDRW getDisqueDVDRWById(Long idDisqueDVDRW) {
        return DisqueDVDRWRepository.findById(idDisqueDVDRW).orElse(null);
    }

    // Delete DisqueDVDRW
    public String DeleteDisqueDVDRW(Long idDisqueDVDRW) {
        DisqueDVDRWRepository.deleteById(idDisqueDVDRW);
        return "DisqueDVDRW Removed !!" + idDisqueDVDRW;
    }

    // UpDate DisqueDVDRW
    // public DisqueDVDRW UpdateDisqueDVDRW(DisqueDVDRW DisqueDVDRW) {
    // DisqueDVDRW existingDisqueDVDRW =
    // DisqueDVDRWRepository.findById(DisqueDVDRW.getIdDisqueDVDRW())
    // .orElse(null);
    // existingDisqueDVDRW.setDisqueDVDRWnom(DisqueDVDRW.getDisqueDVDRWnom());
    // existingDisqueDVDRW.setDisqueDVDRWprenom(DisqueDVDRW.getDisqueDVDRWprenom());
    // existingDisqueDVDRW.setDisqueDVDRWemail(DisqueDVDRW.getDisqueDVDRWemail());
    // existingDisqueDVDRW.setDisqueDVDRWmotdepasse(DisqueDVDRW.getDisqueDVDRWmotdepasse());
    // existingDisqueDVDRW.setDisqueDVDRWadress(DisqueDVDRW.getDisqueDVDRWadress());
    // existingDisqueDVDRW.setDisqueDVDRWntel(DisqueDVDRW.getDisqueDVDRWntel());

    // return DisqueDVDRWRepository.save(existingDisqueDVDRW);
    // }

}
