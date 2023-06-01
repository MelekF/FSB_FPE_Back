package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Casque")

public class Casque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCasque;

    @Column(name = "dateachatCasque")
    private Date dateachatCasque;

    @Column(name = "datereceptionCasque")
    private Date datereceptionCasque;

    @Column(name = "nbrCasque")
    private int nbrCasque;

    @Column(name = "caracteristiqueCasque")
    private String caracteristiqueCasque;

    @Column(name = "nbrdeserieCasque")
    private String nbrdeserieCasque;

    @Column(name = "nbrinventaireCasque")
    private String nbrinventaireCasque;

    @Column(name = "dateaffectationCasque")
    private String dateaffectationCasque;

    @Column(name = "affectationpersoneCasque")
    private String affectationpersoneCasque;

    @Column(name = "observationCasque")
    private String observationCasque;

    @Column(name = "quantiteCasque")
    private Date quantiteCasque;

}
