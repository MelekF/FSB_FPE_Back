package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "CableUSB")

public class CableUSB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCableUSB;

    @Column(name = "datereceptionCableUSB")
    private Date datereceptionCableUSB;

    @Column(name = "nbrCableUSB")
    private int nbrCableUSB;

    @Column(name = "caracteristiqueCableUSB")
    private String caracteristiqueCableUSB;

    @Column(name = "nbrdeserieCableUSB")
    private String nbrdeserieCableUSB;

    @Column(name = "nbrinventaireCableUSB")
    private String nbrinventaireCableUSB;

    @Column(name = "dateaffectationCableUSB")
    private String dateaffectationCableUSB;

    @Column(name = "affectationpersoneCableUSB")
    private String affectationpersoneCableUSB;

    @Column(name = "observationCableUSB")
    private String observationCableUSB;

    @Column(name = "nbrtotaleCableUSB")
    private Date nbrtotaleCableUSB;

}
