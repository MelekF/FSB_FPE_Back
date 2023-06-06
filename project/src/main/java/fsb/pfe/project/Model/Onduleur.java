package fsb.pfe.project.Model;

import javax.persistence.*;
import java.sql.Date;


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