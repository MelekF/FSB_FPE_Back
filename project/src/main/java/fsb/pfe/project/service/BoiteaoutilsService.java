package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Boiteaoutils;
import fsb.pfe.project.Repository.BoiteaoutilsRepository;

public class BoiteaoutilsService {
    @Autowired
    private BoiteaoutilsRepository BoiteaoutilsRepository;

    // Cree un Boiteaoutils
    public Boiteaoutils CreateBoiteaoutils(Boiteaoutils Boiteaoutils) {
        return BoiteaoutilsRepository.save(Boiteaoutils);
    }

    // Cree des Boiteaoutilss
    public List<Boiteaoutils> CreateBoiteaoutilss(List<Boiteaoutils> Boiteaoutils) {
        return BoiteaoutilsRepository.saveAll(Boiteaoutils);
    }

    // get Boiteaoutilss

    public List<Boiteaoutils> getBoiteaoutilss() {
        return BoiteaoutilsRepository.findAll();
    }

    // get Boiteaoutils By Id
    public Boiteaoutils getBoiteaoutilsById(Long idBoiteaoutils) {
        return BoiteaoutilsRepository.findById(idBoiteaoutils).orElse(null);
    }

    // Delete Boiteaoutils
    public String DeleteBoiteaoutils(Long idBoiteaoutils) {
        BoiteaoutilsRepository.deleteById(idBoiteaoutils);
        return "Boiteaoutils Removed !!" + idBoiteaoutils;
    }

    // UpDate Boiteaoutils
    // public Boiteaoutils UpdateBoiteaoutils(Boiteaoutils Boiteaoutils) {
    // Boiteaoutils existingBoiteaoutils =
    // BoiteaoutilsRepository.findById(Boiteaoutils.getIdBoiteaoutils())
    // .orElse(null);
    // existingBoiteaoutils.setBoiteaoutilsnom(Boiteaoutils.getBoiteaoutilsnom());
    // existingBoiteaoutils.setBoiteaoutilsprenom(Boiteaoutils.getBoiteaoutilsprenom());
    // existingBoiteaoutils.setBoiteaoutilsemail(Boiteaoutils.getBoiteaoutilsemail());
    // existingBoiteaoutils.setBoiteaoutilsmotdepasse(Boiteaoutils.getBoiteaoutilsmotdepasse());
    // existingBoiteaoutils.setBoiteaoutilsadress(Boiteaoutils.getBoiteaoutilsadress());
    // existingBoiteaoutils.setBoiteaoutilsntel(Boiteaoutils.getBoiteaoutilsntel());

    // return BoiteaoutilsRepository.save(existingBoiteaoutils);
    // }

}
