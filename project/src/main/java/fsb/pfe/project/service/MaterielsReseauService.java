package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.MaterielsReseau;
import fsb.pfe.project.Repository.MaterielsReseauRepository;

public class MaterielsReseauService {
    @Autowired
    private MaterielsReseauRepository MaterielsReseauRepository;

    // Cree un MaterielsReseau
    public MaterielsReseau CreateMaterielsReseau(MaterielsReseau MaterielsReseau) {
        return MaterielsReseauRepository.save(MaterielsReseau);
    }

    // Cree des MaterielsReseaus
    public List<MaterielsReseau> CreateMaterielsReseaus(List<MaterielsReseau> MaterielsReseau) {
        return MaterielsReseauRepository.saveAll(MaterielsReseau);
    }

    // get MaterielsReseaus

    public List<MaterielsReseau> getMaterielsReseaus() {
        return MaterielsReseauRepository.findAll();
    }

    // get MaterielsReseau By Id
    public MaterielsReseau getMaterielsReseauById(Long idMaterielsReseau) {
        return MaterielsReseauRepository.findById(idMaterielsReseau).orElse(null);
    }

    // Delete MaterielsReseau
    public String DeleteMaterielsReseau(Long idMaterielsReseau) {
        MaterielsReseauRepository.deleteById(idMaterielsReseau);
        return "MaterielsReseau Removed !!" + idMaterielsReseau;
    }

    // UpDate MaterielsReseau
    // public MaterielsReseau UpdateMaterielsReseau(MaterielsReseau MaterielsReseau)
    // {
    // MaterielsReseau existingMaterielsReseau =
    // MaterielsReseauRepository.findById(MaterielsReseau.getIdMaterielsReseau())
    // .orElse(null);
    // existingMaterielsReseau.setMaterielsReseaunom(MaterielsReseau.getMaterielsReseaunom());
    // existingMaterielsReseau.setMaterielsReseauprenom(MaterielsReseau.getMaterielsReseauprenom());
    // existingMaterielsReseau.setMaterielsReseauemail(MaterielsReseau.getMaterielsReseauemail());
    // existingMaterielsReseau.setMaterielsReseaumotdepasse(MaterielsReseau.getMaterielsReseaumotdepasse());
    // existingMaterielsReseau.setMaterielsReseauadress(MaterielsReseau.getMaterielsReseauadress());
    // existingMaterielsReseau.setMaterielsReseauntel(MaterielsReseau.getMaterielsReseauntel());

    // return MaterielsReseauRepository.save(existingMaterielsReseau);
    // }

}
