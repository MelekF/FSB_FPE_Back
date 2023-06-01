package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Tournevis;
import fsb.pfe.project.Repository.TournevisRepository;

public class TournevisService {
    @Autowired
    private TournevisRepository TournevisRepository;

    // Cree un Tournevis
    public Tournevis CreateTournevis(Tournevis Tournevis) {
        return TournevisRepository.save(Tournevis);
    }

    // Cree des Tourneviss
    public List<Tournevis> CreateTourneviss(List<Tournevis> Tournevis) {
        return TournevisRepository.saveAll(Tournevis);
    }

    // get Tourneviss

    public List<Tournevis> getTourneviss() {
        return TournevisRepository.findAll();
    }

    // get Tournevis By Id
    public Tournevis getTournevisById(Long idTournevis) {
        return TournevisRepository.findById(idTournevis).orElse(null);
    }

    // Delete Tournevis
    public String DeleteTournevis(Long idTournevis) {
        TournevisRepository.deleteById(idTournevis);
        return "Tournevis Removed !!" + idTournevis;
    }

    // UpDate Tournevis
    // public Tournevis UpdateTournevis(Tournevis Tournevis) {
    // Tournevis existingTournevis =
    // TournevisRepository.findById(Tournevis.getIdTournevis())
    // .orElse(null);
    // existingTournevis.setTournevisnom(Tournevis.getTournevisnom());
    // existingTournevis.setTournevisprenom(Tournevis.getTournevisprenom());
    // existingTournevis.setTournevisemail(Tournevis.getTournevisemail());
    // existingTournevis.setTournevismotdepasse(Tournevis.getTournevismotdepasse());
    // existingTournevis.setTournevisadress(Tournevis.getTournevisadress());
    // existingTournevis.setTournevisntel(Tournevis.getTournevisntel());

    // return TournevisRepository.save(existingTournevis);
    // }

}
