package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Tournevis")
public class Tournevis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTournevis;

    @Column(name = "dateachatTournevis")
    private Date dateachatTournevis;

    @Column(name = "datereceptionTournevis")
    private Date datereceptionTournevis;

    @Column(name = "nbrTournevis")
    private int nbrTournevis;

    @Column(name = "caracteristiqueTournevis")
    private String caracteristiqueTournevis;

    @Column(name = "nbrdeserieTournevis")
    private String nbrdeserieTournevis;

    @Column(name = "nbrinventaireTournevis")
    private String nbrinventaireTournevis;

    @Column(name = "dateaffectationTournevis")
    private String dateaffectationTournevis;

    @Column(name = "affectationpersoneTournevis")
    private String affectationpersoneTournevis;

    @Column(name = "observationTournevis")
    private String observationTournevis;
    @Column(name = "quantiteTournevis")
    private Date quantiteTournevis;

}
