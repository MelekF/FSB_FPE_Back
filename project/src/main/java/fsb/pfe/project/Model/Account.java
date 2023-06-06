package fsb.pfe.project.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fsb.pfe.project.Enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)

    private String username;
    private String password;
   private Role role;
    private Boolean status;

    @OneToOne(mappedBy = "account")
    @JsonIgnore
    private User user;

    public Account(String username, String password, Role role, Boolean status) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

}
