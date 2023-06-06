package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "BoitierExterne")
public class BoitierExterne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBoitierExterne;

    @Column(name = "dateachatBoitierExterne")
    private Date dateachatBoitierExterne;

    @Column(name = "datereceptionBoitierExterne")
    private Date datereceptionBoitierExterne;

    @Column(name = "nbrBoitierExterne")
    private int nbrBoitierExterne;

    @Column(name = "caracteristiqueBoitierExterne")
    private String caracteristiqueBoitierExterne;

    @Column(name = "nbrdeserieBoitierExterne")
    private String nbrdeserieBoitierExterne;

    @Column(name = "nbrinventaireBoitierExterne")
    private String nbrinventaireBoitierExterne;

    @Column(name = "dateaffectationBoitierExterne")
    private String dateaffectationBoitierExterne;

    @Column(name = "affectationpersoneBoitierExterne")
    private String affectationpersoneBoitierExterne;

    @Column(name = "observationBoitierExterne")
    private String observationBoitierExterne;

    @Column(name = "quantiteBoitierExterne")
    private Date quantiteBoitierExterne;

}
