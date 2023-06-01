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

import fsb.pfe.project.Model.Switch;
import fsb.pfe.project.service.SwitchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SwitchController {

    private SwitchService SwitchService;

    @PostMapping("/addSwitch")
    public Switch CreateSwitch(@RequestBody Switch Switch) {
        return SwitchService.CreateSwitch(Switch);
    }

    // @PostMapping("/addSwitchs")
    // public List<Switch> CreateSwitchs(@RequestBody List<Switch>
    // Switch) {
    // return SwitchService.CreateSwitchs(Switch);
    // }

    @GetMapping("/Switchs")
    public List<Switch> getSwitchs() {
        return SwitchService.getSwitchs();
    }

    @GetMapping("/Switch/{idSwitch}")
    public Switch getSwitchById(@PathVariable Long idSwitch) {
        return SwitchService.getSwitchById(idSwitch);
    }

    // @PutMapping("/updateSwitch")
    // public Switch UpdateSwitch(@RequestBody Switch Switch) {
    // return SwitchService.UpdateSwitch(Switch);
    // }

    @DeleteMapping("/delete/{idSwitch}")
    public String DeleteSwitch(@PathVariable Long idSwitch) {
        return SwitchService.DeleteSwitch(idSwitch);
    }

}
