package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "BoiteAlimentation")
public class BoiteAlimentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBoiteAlimentation;

    @Column(name = "dateachatBoiteAlimentation")
    private Date dateachatBoiteAlimentation;

    @Column(name = "datereceptionBoiteAlimentation")
    private Date datereceptionBoiteAlimentation;

    @Column(name = "nbrBoiteAlimentation")
    private int nbrBoiteAlimentation;

    @Column(name = "caracteristiqueBoiteAlimentation")
    private String caracteristiqueBoiteAlimentation;

    @Column(name = "nbrdeserieBoiteAlimentation")
    private String nbrdeserieBoiteAlimentation;

    @Column(name = "nbrinventaireBoiteAlimentation")
    private String nbrinventaireBoiteAlimentation;

    @Column(name = "dateaffectationBoiteAlimentation")
    private String dateaffectationBoiteAlimentation;

    @Column(name = "affectationpersoneBoiteAlimentation")
    private String affectationpersoneBoiteAlimentation;

    @Column(name = "observationBoiteAlimentation")
    private String observationBoiteAlimentation;
    @Column(name = "quantiteBoiteAlimentation")
    private Date quantiteBoiteAlimentation;

}
