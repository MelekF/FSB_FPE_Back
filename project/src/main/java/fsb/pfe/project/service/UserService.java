package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsb.pfe.project.Model.User;
import fsb.pfe.project.Repository.UserRepository;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Cree un User
    public User CreateUser(User User) {
        return userRepository.save(User);
    }

    // Cree des Users
    public List<User> CreateUsers(List<User> User) {
        return userRepository.saveAll(User);
    }

    // get Users

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // get User By Id
    public User getUserById(Long idUser) {
        return userRepository.findById(idUser).orElse(null);
    }
    //
    // public User getUserByname(String usernom) {
    // return null;
    // }

    // Delete User
    public String DeleteUser(Long idUser) {
        userRepository.deleteById(idUser);
        return "User Removed !!" + idUser;
    }

    // UpDate User
    public User UpdateUser(User User) {
        return userRepository.save(User);
    }
    // UpDate User
    //public User UpdateUser(User User) {
      //  User existingUser = userRepository.findById(User.getIduser())
        //        .orElse(null);
        //existingUser.setUsernom(User.getUsernom());
      //  existingUser.setUserprenom(User.getUserprenom());
       // existingUser.setUseremail(User.getUseremail());
        //existingUser.setUsermotdepasse(User.getUsermotdepasse());
       // existingUser.setUseradress(User.getUseradress());
      //  existingUser.setUserntel(User.getUserntel());

       // return userRepository.save(existingUser);
  //  }

}
