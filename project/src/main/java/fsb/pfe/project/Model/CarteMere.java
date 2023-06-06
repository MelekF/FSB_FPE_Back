package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "CarteMere")
public class CarteMere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarteMere;

    @Column(name = "datereceptionCarteMere")
    private Date datereceptionCarteMere;

    @Column(name = "nbrCarteMere")
    private int nbrCarteMere;

    @Column(name = "caracteristiqueCarteMere")
    private String caracteristiqueCarteMere;

    @Column(name = "nbrdeserieCarteMere")
    private String nbrdeserieCarteMere;

    @Column(name = "nbrinventaireCarteMere")
    private String nbrinventaireCarteMere;

    @Column(name = "dateaffectationCarteMere")
    private String dateaffectationCarteMere;

    @Column(name = "affectationpersoneCarteMere")
    private String affectationpersoneCarteMere;

    @Column(name = "observationCarteMere")
    private String observationCarteMere;

    @Column(name = "nbrtotaleCarteMere")
    private Date nbrtotaleCarteMere;

}
