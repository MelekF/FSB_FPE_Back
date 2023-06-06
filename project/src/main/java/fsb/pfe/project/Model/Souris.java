package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "Souris")
public class Souris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSouris;

    @Column(name = "dateachatSouris")
    private Date dateachatSouris;

    @Column(name = "datereceptionSouris")
    private Date datereceptionSouris;

    @Column(name = "nbrSouris")
    private int nbrSouris;

    @Column(name = "caracteristiqueSouris")
    private String caracteristiqueSouris;

    @Column(name = "nbrdeserieSouris")
    private String nbrdeserieSouris;

    @Column(name = "nbrinventaireSouris")
    private String nbrinventaireSouris;

    @Column(name = "marqueSouris")
    private String marqueSouris;

    @Column(name = "modeleSouris")
    private String modeleSouris;

    @Column(name = "connexionSouris")
    private String connexionSouris;

    @Column(name = "dateaffectationSouris")
    private String dateaffectationSouris;

    @Column(name = "affectationpersoneSouris")
    private String affectationpersoneSouris;

    @Column(name = "observationSouris")
    private String observationSouris;

    @Column(name = "quantiteSouris")
    private Date quantiteSouris;

}
