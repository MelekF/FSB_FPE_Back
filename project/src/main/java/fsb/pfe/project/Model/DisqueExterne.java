package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "DisqueExterne")
public class DisqueExterne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisqueExterne;

    @Column(name = "dateachatDisqueExterne")
    private Date dateachatDisqueExterne;

    @Column(name = "datereceptionDisqueExterne")
    private Date datereceptionDisqueExterne;

    @Column(name = "nbrDisqueExterne")
    private int nbrDisqueExterne;

    @Column(name = "caracteristiqueDisqueExterne")
    private String caracteristiqueDisqueExterne;

    @Column(name = "nbrdeserieDisqueExterne")
    private String nbrdeserieDisqueExterne;

    @Column(name = "nbrinventaireDisqueExterne")
    private String nbrinventaireDisqueExterne;

    @Column(name = "marqueDisqueExterne")
    private String marqueDisqueExterne;

    @Column(name = "modeleDisqueExterne")
    private String modeleDisqueExterne;

    @Column(name = "capaciteDisqueExterne")
    private String capaciteDisqueExterne;

    @Column(name = "dateaffectationDisqueExterne")
    private String dateaffectationDisqueExterne;

    @Column(name = "affectationpersoneDisqueExterne")
    private String affectationpersoneDisqueExterne;

    @Column(name = "observationDisqueExterne")
    private String observationDisqueExterne;

    @Column(name = "quantiteDisqueExterne")
    private Date quantiteDisqueExterne;

}
