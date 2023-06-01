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

import fsb.pfe.project.Model.TesteurRJ45;
import fsb.pfe.project.service.TesteurRJ45Service;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TesteurRJ45Controller {

    private TesteurRJ45Service TesteurRJ45Service;

    @PostMapping("/addTesteurRJ45")
    public TesteurRJ45 CreateTesteurRJ45(@RequestBody TesteurRJ45 TesteurRJ45) {
        return TesteurRJ45Service.CreateTesteurRJ45(TesteurRJ45);
    }

    // @PostMapping("/addTesteurRJ45s")
    // public List<TesteurRJ45> CreateTesteurRJ45s(@RequestBody List<TesteurRJ45>
    // TesteurRJ45) {
    // return TesteurRJ45Service.CreateTesteurRJ45s(TesteurRJ45);
    // }

    @GetMapping("/TesteurRJ45s")
    public List<TesteurRJ45> getTesteurRJ45s() {
        return TesteurRJ45Service.getTesteurRJ45s();
    }

    @GetMapping("/TesteurRJ45/{idTesteurRJ45}")
    public TesteurRJ45 getTesteurRJ45ById(@PathVariable Long idTesteurRJ45) {
        return TesteurRJ45Service.getTesteurRJ45ById(idTesteurRJ45);
    }

    // @PutMapping("/updateTesteurRJ45")
    // public TesteurRJ45 UpdateTesteurRJ45(@RequestBody TesteurRJ45 TesteurRJ45) {
    // return TesteurRJ45Service.UpdateTesteurRJ45(TesteurRJ45);
    // }

    @DeleteMapping("/delete/{idTesteurRJ45}")
    public String DeleteTesteurRJ45(@PathVariable Long idTesteurRJ45) {
        return TesteurRJ45Service.DeleteTesteurRJ45(idTesteurRJ45);
    }

}
