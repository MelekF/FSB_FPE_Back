package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Ventilateur")
public class Ventilateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVentilateur;

    @Column(name = "dateachatVentilateur")
    private Date dateachatVentilateur;

    @Column(name = "datereceptionVentilateur")
    private Date datereceptionVentilateur;

    @Column(name = "nbrVentilateur")
    private int nbrVentilateur;

    @Column(name = "caracteristiqueVentilateur")
    private String caracteristiqueVentilateur;

    @Column(name = "nbrdeserieVentilateur")
    private String nbrdeserieVentilateur;

    @Column(name = "nbrinventaireVentilateur")
    private String nbrinventaireVentilateur;

    @Column(name = "dateaffectationVentilateur")
    private String dateaffectationVentilateur;

    @Column(name = "affectationpersoneVentilateur")
    private String affectationpersoneVentilateur;

    @Column(name = "observationVentilateur")
    private String observationVentilateur;

    @Column(name = "quantiteVentilateur")
    private Date quantiteVentilateur;

}
