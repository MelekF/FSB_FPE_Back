package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "CarteReseau")
public class CarteReseau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarteReseau;

    @Column(name = "datereceptionCarteReseau")
    private Date datereceptionCarteReseau;

    @Column(name = "nbrCarteReseau")
    private int nbrCarteReseau;

    @Column(name = "caracteristiqueCarteReseau")
    private String caracteristiqueCarteReseau;

    @Column(name = "nbrdeserieCarteReseau")
    private String nbrdeserieCarteReseau;

    @Column(name = "nbrinventaireCarteReseau")
    private String nbrinventaireCarteReseau;

    @Column(name = "dateaffectationCarteReseau")
    private String dateaffectationCarteReseau;

    @Column(name = "affectationpersoneCarteReseau")
    private String affectationpersoneCarteReseau;

    @Column(name = "observationCarteReseau")
    private String observationCarteReseau;

    @Column(name = "nbrtotaleCarteReseau")
    private Date nbrtotaleCarteReseau;

}