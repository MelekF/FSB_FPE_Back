package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "SerreCable")
public class SerreCable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSerreCable;

    @Column(name = "dateachatSerreCable")
    private Date dateachatSerreCable;

    @Column(name = "datereceptionSerreCable")
    private Date datereceptionSerreCable;

    @Column(name = "nbrSerreCable")
    private int nbrSerreCable;

    @Column(name = "caracteristiqueSerreCable")
    private String caracteristiqueSerreCable;

    @Column(name = "nbrdeserieSerreCable")
    private String nbrdeserieSerreCable;

    @Column(name = "nbrinventaireSerreCable")
    private String nbrinventaireSerreCable;

    @Column(name = "dateaffectationSerreCable")
    private String dateaffectationSerreCable;

    @Column(name = "affectationpersoneSerreCable")
    private String affectationpersoneSerreCable;

    @Column(name = "observationSerreCable")
    private String observationSerreCable;
    @Column(name = "quantiteSerreCable")
    private Date quantiteSerreCable;

}
