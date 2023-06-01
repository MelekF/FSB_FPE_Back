package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.FlashDisque;
import fsb.pfe.project.Repository.FlashDisqueRepository;

public class FlashDisqueService {
    @Autowired
    private FlashDisqueRepository FlashDisqueRepository;

    // Cree un FlashDisque
    public FlashDisque CreateFlashDisque(FlashDisque FlashDisque) {
        return FlashDisqueRepository.save(FlashDisque);
    }

    // Cree des FlashDisques
    public List<FlashDisque> CreateFlashDisques(List<FlashDisque> FlashDisque) {
        return FlashDisqueRepository.saveAll(FlashDisque);
    }

    // get FlashDisques

    public List<FlashDisque> getFlashDisques() {
        return FlashDisqueRepository.findAll();
    }

    // get FlashDisque By Id
    public FlashDisque getFlashDisqueById(Long idFlashDisque) {
        return FlashDisqueRepository.findById(idFlashDisque).orElse(null);
    }

    // Delete FlashDisque
    public String DeleteFlashDisque(Long idFlashDisque) {
        FlashDisqueRepository.deleteById(idFlashDisque);
        return "FlashDisque Removed !!" + idFlashDisque;
    }

    // UpDate FlashDisque
    // public FlashDisque UpdateFlashDisque(FlashDisque FlashDisque) {
    // FlashDisque existingFlashDisque =
    // FlashDisqueRepository.findById(FlashDisque.getIdFlashDisque())
    // .orElse(null);
    // existingFlashDisque.setFlashDisquenom(FlashDisque.getFlashDisquenom());
    // existingFlashDisque.setFlashDisqueprenom(FlashDisque.getFlashDisqueprenom());
    // existingFlashDisque.setFlashDisqueemail(FlashDisque.getFlashDisqueemail());
    // existingFlashDisque.setFlashDisquemotdepasse(FlashDisque.getFlashDisquemotdepasse());
    // existingFlashDisque.setFlashDisqueadress(FlashDisque.getFlashDisqueadress());
    // existingFlashDisque.setFlashDisquentel(FlashDisque.getFlashDisquentel());

    // return FlashDisqueRepository.save(existingFlashDisque);
    // }

}
