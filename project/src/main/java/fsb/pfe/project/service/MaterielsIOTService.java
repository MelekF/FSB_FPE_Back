package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.MaterielsIOT;
import fsb.pfe.project.Repository.MaterielsIOTRepository;

public class MaterielsIOTService {
    @Autowired
    private MaterielsIOTRepository MaterielsIOTRepository;

    // Cree un MaterielsIOT
    public MaterielsIOT CreateMaterielsIOT(MaterielsIOT MaterielsIOT) {
        return MaterielsIOTRepository.save(MaterielsIOT);
    }

    // Cree des MaterielsIOTs
    public List<MaterielsIOT> CreateMaterielsIOTs(List<MaterielsIOT> MaterielsIOT) {
        return MaterielsIOTRepository.saveAll(MaterielsIOT);
    }

    // get MaterielsIOTs

    public List<MaterielsIOT> getMaterielsIOTs() {
        return MaterielsIOTRepository.findAll();
    }

    // get MaterielsIOT By Id
    public MaterielsIOT getMaterielsIOTById(Long idMaterielsIOT) {
        return MaterielsIOTRepository.findById(idMaterielsIOT).orElse(null);
    }

    // Delete MaterielsIOT
    public String DeleteMaterielsIOT(Long idMaterielsIOT) {
        MaterielsIOTRepository.deleteById(idMaterielsIOT);
        return "MaterielsIOT Removed !!" + idMaterielsIOT;
    }

    // UpDate MaterielsIOT
    // public MaterielsIOT UpdateMaterielsIOT(MaterielsIOT MaterielsIOT) {
    // MaterielsIOT existingMaterielsIOT =
    // MaterielsIOTRepository.findById(MaterielsIOT.getIdMaterielsIOT())
    // .orElse(null);
    // existingMaterielsIOT.setMaterielsIOTnom(MaterielsIOT.getMaterielsIOTnom());
    // existingMaterielsIOT.setMaterielsIOTprenom(MaterielsIOT.getMaterielsIOTprenom());
    // existingMaterielsIOT.setMaterielsIOTemail(MaterielsIOT.getMaterielsIOTemail());
    // existingMaterielsIOT.setMaterielsIOTmotdepasse(MaterielsIOT.getMaterielsIOTmotdepasse());
    // existingMaterielsIOT.setMaterielsIOTadress(MaterielsIOT.getMaterielsIOTadress());
    // existingMaterielsIOT.setMaterielsIOTntel(MaterielsIOT.getMaterielsIOTntel());

    // return MaterielsIOTRepository.save(existingMaterielsIOT);
    // }

}
