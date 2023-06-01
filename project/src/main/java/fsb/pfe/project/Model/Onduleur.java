package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Onduleur")
public class Onduleur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOnduleur;

    @Column(name = "datereceptionOnduleur")
    private Date datereceptionOnduleur;

    @Column(name = "nbrOnduleur")
    private int nbrOnduleur;

    @Column(name = "caracteristiqueOnduleur")
    private String caracteristiqueOnduleur;

    @Column(name = "nbrdeserieOnduleur")
    private String nbrdeserieOnduleur;

    @Column(name = "nbrinventaireOnduleur")
    private String nbrinventaireOnduleur;

    @Column(name = "dateaffectationOnduleur")
    private String dateaffectationOnduleur;

    @Column(name = "affectationpersoneOnduleur")
    private String affectationpersoneOnduleur;

    @Column(name = "observationOnduleur")
    private String observationOnduleur;

    @Column(name = "nbrtotaleOnduleur")
    private Date nbrtotaleOnduleur;

}