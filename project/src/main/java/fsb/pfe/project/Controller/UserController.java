package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.User;
import fsb.pfe.project.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    @Autowired
    private UserService UserService;

    @PostMapping("/adduser")
    public User CreateUser(@RequestBody User user) {
        return UserService.CreateUser(user);
    }

    @PostMapping("/addusers")
    public List<User> CreateUsers(@RequestBody List<User> user) {
        return UserService.CreateUsers(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return UserService.getUsers();
    }

    @GetMapping("/user/{iduser}")
    public User getUserById(@PathVariable Long iduser) {
        return UserService.getUserById(iduser);
    }

    // @GetMapping("/user/{usernom}")
    // public User getUserByname(@PathVariable String usernom) {
    // return UserService.getUserByname(usernom);
    // }

    @PutMapping("/updateuser")
    public User Updateuser(@RequestBody User user) {
        return UserService.UpdateUser(user);
    }

    @DeleteMapping("/delete/{iduser}")
    public String Deleteuser(@PathVariable Long iduser) {
        return UserService.DeleteUser(iduser);
    }

}
