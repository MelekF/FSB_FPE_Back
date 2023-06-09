package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "Boiteaoutils")
public class Boiteaoutils {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBoiteaoutils;

    @Column(name = "dateachatBoiteaoutils")
    private Date dateachatBoiteaoutils;

    @Column(name = "datereceptionBoiteaoutils")
    private Date datereceptionBoiteaoutils;

    @Column(name = "nbrBoiteaoutils")
    private int nbrBoiteaoutils;

    @Column(name = "caracteristiqueBoiteaoutils")
    private String caracteristiqueBoiteaoutils;

    @Column(name = "nbrdeserieBoiteaoutils")
    private String nbrdeserieBoiteaoutils;

    @Column(name = "nbrinventaireBoiteaoutils")
    private String nbrinventaireBoiteaoutils;

    @Column(name = "dateaffectationBoiteaoutils")
    private String dateaffectationBoiteaoutils;

    @Column(name = "affectationpersoneBoiteaoutils")
    private String affectationpersoneBoiteaoutils;

    @Column(name = "observationBoiteaoutils")
    private String observationBoiteaoutils;
    @Column(name = "quantiteBoiteaoutils")
    private Date quantiteBoiteaoutils;

}
