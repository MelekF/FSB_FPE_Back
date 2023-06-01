package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsb.pfe.project.Model.TesteurRJ45;
import fsb.pfe.project.Repository.TesteurRJ45Repository;

public class TesteurRJ45Service {
    @Autowired
    private TesteurRJ45Repository TesteurRJ45Repository;

    // Cree un TesteurRJ45
    public TesteurRJ45 CreateTesteurRJ45(TesteurRJ45 TesteurRJ45) {
        return TesteurRJ45Repository.save(TesteurRJ45);
    }

    // Cree des TesteurRJ45s
    public List<TesteurRJ45> CreateTesteurRJ45s(List<TesteurRJ45> TesteurRJ45) {
        return TesteurRJ45Repository.saveAll(TesteurRJ45);
    }

    // get TesteurRJ45s

    public List<TesteurRJ45> getTesteurRJ45s() {
        return TesteurRJ45Repository.findAll();
    }

    // get TesteurRJ45 By Id
    public TesteurRJ45 getTesteurRJ45ById(Long idTesteurRJ45) {
        return TesteurRJ45Repository.findById(idTesteurRJ45).orElse(null);
    }

    // Delete TesteurRJ45
    public String DeleteTesteurRJ45(Long idTesteurRJ45) {
        TesteurRJ45Repository.deleteById(idTesteurRJ45);
        return "TesteurRJ45 Removed !!" + idTesteurRJ45;
    }

    // UpDate TesteurRJ45
    // public TesteurRJ45 UpdateTesteurRJ45(TesteurRJ45 TesteurRJ45) {
    // TesteurRJ45 existingTesteurRJ45 =
    // TesteurRJ45Repository.findById(TesteurRJ45.getIdTesteurRJ45())
    // .orElse(null);
    // existingTesteurRJ45.setTesteurRJ45nom(TesteurRJ45.getTesteurRJ45nom());
    // existingTesteurRJ45.setTesteurRJ45prenom(TesteurRJ45.getTesteurRJ45prenom());
    // existingTesteurRJ45.setTesteurRJ45email(TesteurRJ45.getTesteurRJ45email());
    // existingTesteurRJ45.setTesteurRJ45motdepasse(TesteurRJ45.getTesteurRJ45motdepasse());
    // existingTesteurRJ45.setTesteurRJ45adress(TesteurRJ45.getTesteurRJ45adress());
    // existingTesteurRJ45.setTesteurRJ45ntel(TesteurRJ45.getTesteurRJ45ntel());

    // return TesteurRJ45Repository.save(existingTesteurRJ45);
    // }

}
