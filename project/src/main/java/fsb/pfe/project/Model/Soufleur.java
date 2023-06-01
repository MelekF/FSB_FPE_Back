package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Soufleur")
public class Soufleur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSoufleur;

    @Column(name = "dateachatSoufleur")
    private Date dateachatSoufleur;

    @Column(name = "datereceptionSoufleur")
    private Date datereceptionSoufleur;

    @Column(name = "nbrSoufleur")
    private int nbrSoufleur;

    @Column(name = "caracteristiqueSoufleur")
    private String caracteristiqueSoufleur;

    @Column(name = "nbrdeserieSoufleur")
    private String nbrdeserieSoufleur;

    @Column(name = "nbrinventaireSoufleur")
    private String nbrinventaireSoufleur;

    @Column(name = "marqueSoufleur")
    private String marqueSoufleur;

    @Column(name = "modeleSoufleur")
    private String modeleSoufleur;

    @Column(name = "capaciteSoufleur")
    private String capaciteSoufleur;

    @Column(name = "dateaffectationSoufleur")
    private String dateaffectationSoufleur;

    @Column(name = "affectationpersoneSoufleur")
    private String affectationpersoneSoufleur;

    @Column(name = "observationSoufleur")
    private String observationSoufleur;

    @Column(name = "quantiteSoufleur")
    private Date quantiteSoufleur;

}
