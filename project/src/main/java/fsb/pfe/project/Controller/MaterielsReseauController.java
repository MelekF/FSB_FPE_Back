package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.MaterielsReseau;
import fsb.pfe.project.service.MaterielsReseauService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class MaterielsReseauController {

    private MaterielsReseauService MaterielsReseauService;

    @PostMapping("/addMaterielsReseau")
    public MaterielsReseau CreateMaterielsReseau(@RequestBody MaterielsReseau MaterielsReseau) {
        return MaterielsReseauService.CreateMaterielsReseau(MaterielsReseau);
    }

    // @PostMapping("/addMaterielsReseaus")
    // public List<MaterielsReseau> CreateMaterielsReseaus(@RequestBody
    // List<MaterielsReseau>
    // MaterielsReseau) {
    // return MaterielsReseauService.CreateMaterielsReseaus(MaterielsReseau);
    // }

    @GetMapping("/MaterielsReseaus")
    public List<MaterielsReseau> getMaterielsReseaus() {
        return MaterielsReseauService.getMaterielsReseaus();
    }

    @GetMapping("/MaterielsReseau/{idMaterielsReseau}")
    public MaterielsReseau getMaterielsReseauById(@PathVariable Long idMaterielsReseau) {
        return MaterielsReseauService.getMaterielsReseauById(idMaterielsReseau);
    }

    // @PutMapping("/updateMaterielsReseau")
    // public MaterielsReseau UpdateMaterielsReseau(@RequestBody MaterielsReseau
    // MaterielsReseau) {
    // return MaterielsReseauService.UpdateMaterielsReseau(MaterielsReseau);
    // }

    @DeleteMapping("/delete/{idMaterielsReseau}")
    public String DeleteMaterielsReseau(@PathVariable Long idMaterielsReseau) {
        return MaterielsReseauService.DeleteMaterielsReseau(idMaterielsReseau);
    }

}
