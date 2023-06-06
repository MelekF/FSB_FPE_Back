package fsb.pfe.project;

import fsb.pfe.project.Enums.Role;
import fsb.pfe.project.Model.Account;
import fsb.pfe.project.Model.User;
import fsb.pfe.project.service.AccountService;
import fsb.pfe.project.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

/*
	@Bean
	CommandLineRunner run(AccountService accountService, UserService userService){
        return args -> {
          Account account = new Account("admin","admin", Role.ADMIN,true);
          accountService.saveAccount(account);
          User user = new User();
          user.setAccount(account);
          user.setUsernom("admin");
          userService.CreateUser(user);
        };
    }

 */
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
