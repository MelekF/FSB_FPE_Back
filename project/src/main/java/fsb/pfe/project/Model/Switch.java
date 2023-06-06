package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "Switch")
public class Switch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSwitch;

    @Column(name = "dateachatSwitch")
    private Date dateachatSwitch;

    @Column(name = "datereceptionSwitch")
    private Date datereceptionSwitch;

    @Column(name = "nbrSwitch")
    private int nbrSwitch;

    @Column(name = "caracteristiqueSwitch")
    private String caracteristiqueSwitch;

    @Column(name = "nbrdeserieSwitch")
    private String nbrdeserieSwitch;

    @Column(name = "nbrinventaireSwitch")
    private String nbrinventaireSwitch;

    @Column(name = "dateaffectationSwitch")
    private String dateaffectationSwitch;

    @Column(name = "affectationpersoneSwitch")
    private String affectationpersoneSwitch;

    @Column(name = "observationSwitch")
    private String observationSwitch;
    @Column(name = "quantiteSwitch")
    private Date quantiteSwitch;

}
