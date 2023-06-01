package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Adaptateur")
public class Adaptateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdaptateur;

    @Column(name = "dateachatAdaptateur")
    private Date dateachatAdaptateur;

    @Column(name = "datereceptionAdaptateur")
    private Date datereceptionAdaptateur;

    @Column(name = "nbrAdaptateur")
    private int nbrAdaptateur;

    @Column(name = "caracteristiqueAdaptateur")
    private String caracteristiqueAdaptateur;

    @Column(name = "nbrdeserieAdaptateur")
    private String nbrdeserieAdaptateur;

    @Column(name = "nbrinventaireAdaptateur")
    private String nbrinventaireAdaptateur;

    @Column(name = "dateaffectationAdaptateur")
    private String dateaffectationAdaptateur;

    @Column(name = "affectationpersoneAdaptateur")
    private String affectationpersoneAdaptateur;

    @Column(name = "observationAdaptateur")
    private String observationAdaptateur;
    @Column(name = "quantiteAdaptateur")
    private Date quantiteAdaptateur;

}
