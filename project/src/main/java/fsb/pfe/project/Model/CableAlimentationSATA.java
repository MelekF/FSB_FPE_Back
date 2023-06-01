package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "CableAlimentationSATA")
public class CableAlimentationSATA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCableAlimentationSATA;

    @Column(name = "dateachatCableAlimentationSATA")
    private Date dateachatCableAlimentationSATA;

    @Column(name = "datereceptionCableAlimentationSATA")
    private Date datereceptionCableAlimentationSATA;

    @Column(name = "nbrCableAlimentationSATA")
    private int nbrCableAlimentationSATA;

    @Column(name = "caracteristiqueCableAlimentationSATA")
    private String caracteristiqueCableAlimentationSATA;

    @Column(name = "nbrdeserieCableAlimentationSATA")
    private String nbrdeserieCableAlimentationSATA;

    @Column(name = "nbrinventaireCableAlimentationSATA")
    private String nbrinventaireCableAlimentationSATA;

    @Column(name = "dateaffectationCableAlimentationSATA")
    private String dateaffectationCableAlimentationSATA;

    @Column(name = "affectationpersoneCableAlimentationSATA")
    private String affectationpersoneCableAlimentationSATA;

    @Column(name = "observationCableAlimentationSATA")
    private String observationCableAlimentationSATA;
    @Column(name = "quantiteCableAlimentationSATA")
    private Date quantiteCableAlimentationSATA;

}
