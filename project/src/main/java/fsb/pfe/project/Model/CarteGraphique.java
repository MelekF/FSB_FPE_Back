package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "CarteGraphique")
public class CarteGraphique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarteGraphique;

    @Column(name = "dateachatCarteGraphique")
    private Date dateachatCarteGraphique;

    @Column(name = "datereceptionCarteGraphique")
    private Date datereceptionCarteGraphique;

    @Column(name = "nbrCarteGraphique")
    private int nbrCarteGraphique;

    @Column(name = "caracteristiqueCarteGraphique")
    private String caracteristiqueCarteGraphique;

    @Column(name = "nbrdeserieCarteGraphique")
    private String nbrdeserieCarteGraphique;

    @Column(name = "nbrinventaireCarteGraphique")
    private String nbrinventaireCarteGraphique;

    @Column(name = "dateaffectationCarteGraphique")
    private String dateaffectationCarteGraphique;

    @Column(name = "affectationpersoneCarteGraphique")
    private String affectationpersoneCarteGraphique;

    @Column(name = "observationCarteGraphique")
    private String observationCarteGraphique;

    @Column(name = "quantiteCarteGraphique")
    private Date quantiteCarteGraphique;

}
