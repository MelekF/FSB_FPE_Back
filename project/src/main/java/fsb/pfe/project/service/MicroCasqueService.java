package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.MicroCasque;
import fsb.pfe.project.Repository.MicroCasqueRepository;

public class MicroCasqueService {
    @Autowired
    private MicroCasqueRepository MicroCasqueRepository;

    // Cree un MicroCasque
    public MicroCasque CreateMicroCasque(MicroCasque MicroCasque) {
        return MicroCasqueRepository.save(MicroCasque);
    }

    // Cree des MicroCasques
    public List<MicroCasque> CreateMicroCasques(List<MicroCasque> MicroCasque) {
        return MicroCasqueRepository.saveAll(MicroCasque);
    }

    // get MicroCasques

    public List<MicroCasque> getMicroCasques() {
        return MicroCasqueRepository.findAll();
    }

    // get MicroCasque By Id
    public MicroCasque getMicroCasqueById(Long idMicroCasque) {
        return MicroCasqueRepository.findById(idMicroCasque).orElse(null);
    }

    // Delete MicroCasque
    public String DeleteMicroCasque(Long idMicroCasque) {
        MicroCasqueRepository.deleteById(idMicroCasque);
        return "MicroCasque Removed !!" + idMicroCasque;
    }

    // UpDate MicroCasque
    // public MicroCasque UpdateMicroCasque(MicroCasque MicroCasque) {
    // MicroCasque existingMicroCasque =
    // MicroCasqueRepository.findById(MicroCasque.getIdMicroCasque())
    // .orElse(null);
    // existingMicroCasque.setMicroCasquenom(MicroCasque.getMicroCasquenom());
    // existingMicroCasque.setMicroCasqueprenom(MicroCasque.getMicroCasqueprenom());
    // existingMicroCasque.setMicroCasqueemail(MicroCasque.getMicroCasqueemail());
    // existingMicroCasque.setMicroCasquemotdepasse(MicroCasque.getMicroCasquemotdepasse());
    // existingMicroCasque.setMicroCasqueadress(MicroCasque.getMicroCasqueadress());
    // existingMicroCasque.setMicroCasquentel(MicroCasque.getMicroCasquentel());

    // return MicroCasqueRepository.save(existingMicroCasque);
    // }

}
