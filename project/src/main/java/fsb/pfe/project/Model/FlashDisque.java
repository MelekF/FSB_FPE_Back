package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "FlashDisque")
public class FlashDisque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFlashDisque;

    @Column(name = "dateachatFlashDisque")
    private Date dateachatFlashDisque;

    @Column(name = "datereceptionFlashDisque")
    private Date datereceptionFlashDisque;

    @Column(name = "nbrFlashDisque")
    private int nbrFlashDisque;

    @Column(name = "caracteristiqueFlashDisque")
    private String caracteristiqueFlashDisque;

    @Column(name = "nbrdeserieFlashDisque")
    private String nbrdeserieFlashDisque;

    @Column(name = "nbrinventaireFlashDisque")
    private String nbrinventaireFlashDisque;

    @Column(name = "dateaffectationFlashDisque")
    private String dateaffectationFlashDisque;

    @Column(name = "affectationpersoneFlashDisque")
    private String affectationpersoneFlashDisque;

    @Column(name = "observationFlashDisque")
    private String observationFlashDisque;

    @Column(name = "quantiteFlashDisque")
    private Date quantiteFlashDisque;

}
