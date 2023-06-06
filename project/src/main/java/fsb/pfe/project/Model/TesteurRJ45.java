package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "TesteurRJ45")
public class TesteurRJ45 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTesteurRJ45;

    @Column(name = "dateachatTesteurRJ45")
    private Date dateachatTesteurRJ45;

    @Column(name = "datereceptionTesteurRJ45")
    private Date datereceptionTesteurRJ45;

    @Column(name = "nbrTesteurRJ45")
    private int nbrTesteurRJ45;

    @Column(name = "caracteristiqueTesteurRJ45")
    private String caracteristiqueTesteurRJ45;

    @Column(name = "nbrdeserieTesteurRJ45")
    private String nbrdeserieTesteurRJ45;

    @Column(name = "nbrinventaireTesteurRJ45")
    private String nbrinventaireTesteurRJ45;

    @Column(name = "marqueTesteurRJ45")
    private String marqueTesteurRJ45;

    @Column(name = "modeleTesteurRJ45")
    private String modeleTesteurRJ45;

    @Column(name = "capaciteTesteurRJ45")
    private String capaciteTesteurRJ45;

    @Column(name = "dateaffectationTesteurRJ45")
    private String dateaffectationTesteurRJ45;

    @Column(name = "affectationpersoneTesteurRJ45")
    private String affectationpersoneTesteurRJ45;

    @Column(name = "observationTesteurRJ45")
    private String observationTesteurRJ45;

    @Column(name = "quantiteTesteurRJ45")
    private Date quantiteTesteurRJ45;

}
