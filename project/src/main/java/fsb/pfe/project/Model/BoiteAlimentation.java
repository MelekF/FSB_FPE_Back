package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "BoiteAlimentation")
public class BoiteAlimentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBoiteAlimentation;

    @Column(name = "dateachatBoiteAlimentation")
    private Date dateachatBoiteAlimentation;

    @Column(name = "datereceptionBoiteAlimentation")
    private Date datereceptionBoiteAlimentation;

    @Column(name = "nbrBoiteAlimentation")
    private int nbrBoiteAlimentation;

    @Column(name = "caracteristiqueBoiteAlimentation")
    private String caracteristiqueBoiteAlimentation;

    @Column(name = "nbrdeserieBoiteAlimentation")
    private String nbrdeserieBoiteAlimentation;

    @Column(name = "nbrinventaireBoiteAlimentation")
    private String nbrinventaireBoiteAlimentation;

    @Column(name = "dateaffectationBoiteAlimentation")
    private String dateaffectationBoiteAlimentation;

    @Column(name = "affectationpersoneBoiteAlimentation")
    private String affectationpersoneBoiteAlimentation;

    @Column(name = "observationBoiteAlimentation")
    private String observationBoiteAlimentation;
    @Column(name = "quantiteBoiteAlimentation")
    private Date quantiteBoiteAlimentation;

}
