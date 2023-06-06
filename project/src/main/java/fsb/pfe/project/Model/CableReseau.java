package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "CableReseau")
public class CableReseau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCableReseau;

    @Column(name = "dateachatCableReseau")
    private Date dateachatCableReseau;

    @Column(name = "datereceptionCableReseau")
    private Date datereceptionCableReseau;

    @Column(name = "nbrCableReseau")
    private int nbrCableReseau;

    @Column(name = "caracteristiqueCableReseau")
    private String caracteristiqueCableReseau;

    @Column(name = "nbrdeserieCableReseau")
    private String nbrdeserieCableReseau;

    @Column(name = "nbrinventaireCableReseau")
    private String nbrinventaireCableReseau;

    @Column(name = "marqueCableReseau")
    private String marqueCableReseau;

    @Column(name = "modeleCableReseau")
    private String modeleCableReseau;

    @Column(name = "capaciteCableReseau")
    private String capaciteCableReseau;

    @Column(name = "dateaffectationCableReseau")
    private String dateaffectationCableReseau;

    @Column(name = "affectationpersoneCableReseau")
    private String affectationpersoneCableReseau;

    @Column(name = "observationCableReseau")
    private String observationCableReseau;

    @Column(name = "quantiteCableReseau")
    private Date quantiteCableReseau;

}
