package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Outillage")
public class Outillage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOutillage;

    @Column(name = "dateachatOutillage")
    private Date dateachatOutillage;

    @Column(name = "datereceptionOutillage")
    private Date datereceptionOutillage;

    @Column(name = "nbrOutillage")
    private int nbrOutillage;

    @Column(name = "caracteristiqueOutillage")
    private String caracteristiqueOutillage;

    @Column(name = "nbrdeserieOutillage")
    private String nbrdeserieOutillage;

    @Column(name = "nbrinventaireOutillage")
    private String nbrinventaireOutillage;

    @Column(name = "dateaffectationOutillage")
    private String dateaffectationOutillage;

    @Column(name = "affectationpersoneOutillage")
    private String affectationpersoneOutillage;

    @Column(name = "observationOutillage")
    private String observationOutillage;
    @Column(name = "quantiteOutillage")
    private Date quantiteOutillage;

}
