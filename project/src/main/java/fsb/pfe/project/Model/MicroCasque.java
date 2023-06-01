package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "MicroCasque")
public class MicroCasque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMicroCasque;

    @Column(name = "dateachatMicroCasque")
    private Date dateachatMicroCasque;

    @Column(name = "datereceptionMicroCasque")
    private Date datereceptionMicroCasque;

    @Column(name = "nbrMicroCasque")
    private int nbrMicroCasque;

    @Column(name = "caracteristiqueMicroCasque")
    private String caracteristiqueMicroCasque;

    @Column(name = "nbrdeserieMicroCasque")
    private String nbrdeserieMicroCasque;

    @Column(name = "nbrinventaireMicroCasque")
    private String nbrinventaireMicroCasque;

    @Column(name = "dateaffectationMicroCasque")
    private String dateaffectationMicroCasque;

    @Column(name = "affectationpersoneMicroCasque")
    private String affectationpersoneMicroCasque;

    @Column(name = "observationMicroCasque")
    private String observationMicroCasque;
    @Column(name = "quantiteMicroCasque")
    private Date quantiteMicroCasque;

}
