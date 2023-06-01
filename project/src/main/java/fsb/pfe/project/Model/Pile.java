package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Pile")
public class Pile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPile;

    @Column(name = "dateachatPile")
    private Date dateachatPile;

    @Column(name = "datereceptionPile")
    private Date datereceptionPile;

    @Column(name = "nbrPile")
    private int nbrPile;

    @Column(name = "caracteristiquePile")
    private String caracteristiquePile;

    @Column(name = "nbrdeseriePile")
    private String nbrdeseriePile;

    @Column(name = "nbrinventairePile")
    private String nbrinventairePile;

    @Column(name = "dateaffectationPile")
    private String dateaffectationPile;

    @Column(name = "affectationpersonePile")
    private String affectationpersonePile;

    @Column(name = "observationPile")
    private String observationPile;

    @Column(name = "quantitePile")
    private Date quantitePile;

}
