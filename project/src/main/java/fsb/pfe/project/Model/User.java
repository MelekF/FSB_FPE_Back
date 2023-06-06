package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="account_id", referencedColumnName = "id")
  private Account account  ;

    @Column(name = "usernom")
    private String usernom;

    @Column(name = "userprenom")
    private String userprenom;

    @Column(name = "useremail")
    private String useremail;

    @Column(name = "usermotdepasse")
    private String usermotdepasse;

    @Column(name = "useradress")
    private String useradress;
    @Column(name = "userntel")
    private String userntel;

    @Column(name = "userdep")
    private String userdep;

    @Column(name = "role")
    private String role;

    public User() {
    }

    public User(Long iduser, String usernom, String userprenom, String useremail, String usermotdepasse,
            String useradress, String userntel, String userdep, String role) {
        this.iduser = iduser;
        this.usernom = usernom;
        this.userprenom = userprenom;
        this.useremail = useremail;
        this.usermotdepasse = usermotdepasse;
        this.useradress = useradress;
        this.userntel = userntel;
        this.userdep = userdep;
        this.role = role;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getUsernom() {
        return usernom;
    }

    public void setUsernom(String usernom) {
        this.usernom = usernom;
    }

    public String getUserprenom() {
        return userprenom;
    }

    public void setUserprenom(String userprenom) {
        this.userprenom = userprenom;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsermotdepasse() {
        return usermotdepasse;
    }

    public void setUsermotdepasse(String usermotdepasse) {
        this.usermotdepasse = usermotdepasse;
    }

    public String getUseradress() {
        return useradress;
    }

    public void setUseradress(String useradress) {
        this.useradress = useradress;
    }

    public String getUserntel() {
        return userntel;
    }

    public void setUserntel(String userntel) {
        this.userntel = userntel;
    }

    public String getUserdep() {
        return userdep;
    }

    public void setUserdep(String userdep) {
        this.userdep = userdep;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
