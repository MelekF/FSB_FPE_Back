package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
