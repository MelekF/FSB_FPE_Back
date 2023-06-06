package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "CableHDMI")
public class CableHDMI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCableHDMI;

    @Column(name = "dateachatCableHDMI")
    private Date dateachatCableHDMI;

    @Column(name = "datereceptionCableHDMI")
    private Date datereceptionCableHDMI;

    @Column(name = "nbrCableHDMI")
    private int nbrCableHDMI;

    @Column(name = "caracteristiqueCableHDMI")
    private String caracteristiqueCableHDMI;

    @Column(name = "nbrdeserieCableHDMI")
    private String nbrdeserieCableHDMI;

    @Column(name = "nbrinventaireCableHDMI")
    private String nbrinventaireCableHDMI;

    @Column(name = "dateaffectationCableHDMI")
    private String dateaffectationCableHDMI;

    @Column(name = "affectationpersoneCableHDMI")
    private String affectationpersoneCableHDMI;

    @Column(name = "observationCableHDMI")
    private String observationCableHDMI;
    @Column(name = "quantiteCableHDMI")
    private Date quantiteCableHDMI;

}
