package fsb.pfe.project.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "CableVGA")
public class CableVGA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCableVGA;

    @Column(name = "dateachatCableVGA")
    private Date dateachatCableVGA;

    @Column(name = "datereceptionCableVGA")
    private Date datereceptionCableVGA;

    @Column(name = "nbrCableVGA")
    private int nbrCableVGA;

    @Column(name = "caracteristiqueCableVGA")
    private String caracteristiqueCableVGA;

    @Column(name = "nbrdeserieCableVGA")
    private String nbrdeserieCableVGA;

    @Column(name = "nbrinventaireCableVGA")
    private String nbrinventaireCableVGA;

    @Column(name = "dateaffectationCableVGA")
    private String dateaffectationCableVGA;

    @Column(name = "affectationpersoneCableVGA")
    private String affectationpersoneCableVGA;

    @Column(name = "observationCableVGA")
    private String observationCableVGA;
    @Column(name = "quantiteCableVGA")
    private Date quantiteCableVGA;

}
