package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.Adaptateur;
import fsb.pfe.project.service.AdaptateurService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

public class AdaptateurController {
    @Autowired

    private AdaptateurService AdaptateurService;

    @PostMapping("/addAdaptateur")
    public Adaptateur CreateAdaptateur(@RequestBody Adaptateur Adaptateur) {
        return AdaptateurService.CreateAdaptateur(Adaptateur);
    }

    // @PostMapping("/addAdaptateurs")
    // public List<Adaptateur> CreateAdaptateurs(@RequestBody List<Adaptateur>
    // Adaptateur) {
    // return AdaptateurService.CreateAdaptateurs(Adaptateur);
    // }

    @GetMapping("/Adaptateurs")
    public List<Adaptateur> getAdaptateurs() {
        return AdaptateurService.getAdaptateurs();
    }

    @GetMapping("/Adaptateur/{idAdaptateur}")
    public Adaptateur getAdaptateurById(@PathVariable Long idAdaptateur) {
        return AdaptateurService.getAdaptateurById(idAdaptateur);
    }

    // @PutMapping("/updateAdaptateur")
    // public Adaptateur UpdateAdaptateur(@RequestBody Adaptateur Adaptateur) {
    // return AdaptateurService.UpdateAdaptateur(Adaptateur);
    // }

    @DeleteMapping("/delete/{idAdaptateur}")
    public String DeleteAdaptateur(@PathVariable Long idAdaptateur) {
        return AdaptateurService.DeleteAdaptateur(idAdaptateur);
    }

}
