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

import fsb.pfe.project.Model.MaterielsIOT;
import fsb.pfe.project.service.MaterielsIOTService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class MaterielsIOTController {

    private MaterielsIOTService MaterielsIOTService;

    @PostMapping("/addMaterielsIOT")
    public MaterielsIOT CreateMaterielsIOT(@RequestBody MaterielsIOT MaterielsIOT) {
        return MaterielsIOTService.CreateMaterielsIOT(MaterielsIOT);
    }

    // @PostMapping("/addMaterielsIOTs")
    // public List<MaterielsIOT> CreateMaterielsIOTs(@RequestBody List<MaterielsIOT>
    // MaterielsIOT) {
    // return MaterielsIOTService.CreateMaterielsIOTs(MaterielsIOT);
    // }

    @GetMapping("/MaterielsIOTs")
    public List<MaterielsIOT> getMaterielsIOTs() {
        return MaterielsIOTService.getMaterielsIOTs();
    }

    @GetMapping("/MaterielsIOT/{idMaterielsIOT}")
    public MaterielsIOT getMaterielsIOTById(@PathVariable Long idMaterielsIOT) {
        return MaterielsIOTService.getMaterielsIOTById(idMaterielsIOT);
    }

    // @PutMapping("/updateMaterielsIOT")
    // public MaterielsIOT UpdateMaterielsIOT(@RequestBody MaterielsIOT
    // MaterielsIOT) {
    // return MaterielsIOTService.UpdateMaterielsIOT(MaterielsIOT);
    // }

    @DeleteMapping("/delete/{idMaterielsIOT}")
    public String DeleteMaterielsIOT(@PathVariable Long idMaterielsIOT) {
        return MaterielsIOTService.DeleteMaterielsIOT(idMaterielsIOT);
    }

}
