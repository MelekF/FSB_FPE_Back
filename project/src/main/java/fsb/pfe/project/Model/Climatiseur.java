package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Climatiseur")
public class Climatiseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClimatiseur;

    @Column(name = "datereceptionClimatiseur")
    private Date datereceptionClimatiseur;

    @Column(name = "nbrClimatiseur")
    private int nbrClimatiseur;

    @Column(name = "caracteristiqueClimatiseur")
    private String caracteristiqueClimatiseur;

    @Column(name = "nbrdeserieClimatiseur")
    private String nbrdeserieClimatiseur;

    @Column(name = "nbrinventaireClimatiseur")
    private String nbrinventaireClimatiseur;

    @Column(name = "dateaffectationClimatiseur")
    private String dateaffectationClimatiseur;

    @Column(name = "affectationpersoneClimatiseur")
    private String affectationpersoneClimatiseur;

    @Column(name = "observationClimatiseur")
    private String observationClimatiseur;

    @Column(name = "nbrtotaleClimatiseur")
    private Date nbrtotaleClimatiseur;

}