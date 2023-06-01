package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.Switch;
import fsb.pfe.project.Repository.SwitchRepository;

public class SwitchService {
    @Autowired
    private SwitchRepository SwitchRepository;

    // Cree un Switch
    public Switch CreateSwitch(Switch Switch) {
        return SwitchRepository.save(Switch);
    }

    // Cree des Switchs
    public List<Switch> CreateSwitchs(List<Switch> Switch) {
        return SwitchRepository.saveAll(Switch);
    }

    // get Switchs

    public List<Switch> getSwitchs() {
        return SwitchRepository.findAll();
    }

    // get Switch By Id
    public Switch getSwitchById(Long idSwitch) {
        return SwitchRepository.findById(idSwitch).orElse(null);
    }

    // Delete Switch
    public String DeleteSwitch(Long idSwitch) {
        SwitchRepository.deleteById(idSwitch);
        return "Switch Removed !!" + idSwitch;
    }

    // UpDate Switch
    // public Switch UpdateSwitch(Switch Switch) {
    // Switch existingSwitch =
    // SwitchRepository.findById(Switch.getIdSwitch())
    // .orElse(null);
    // existingSwitch.setSwitchnom(Switch.getSwitchnom());
    // existingSwitch.setSwitchprenom(Switch.getSwitchprenom());
    // existingSwitch.setSwitchemail(Switch.getSwitchemail());
    // existingSwitch.setSwitchmotdepasse(Switch.getSwitchmotdepasse());
    // existingSwitch.setSwitchadress(Switch.getSwitchadress());
    // existingSwitch.setSwitchntel(Switch.getSwitchntel());

    // return SwitchRepository.save(existingSwitch);
    // }

}
