package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "DisqueDVDRW")
public class DisqueDVDRW {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisqueDVDRW;

    @Column(name = "dateachatDisqueDVDRW")
    private Date dateachatDisqueDVDRW;

    @Column(name = "datereceptionDisqueDVDRW")
    private Date datereceptionDisqueDVDRW;

    @Column(name = "nbrDisqueDVDRW")
    private int nbrDisqueDVDRW;

    @Column(name = "caracteristiqueDisqueDVDRW")
    private String caracteristiqueDisqueDVDRW;

    @Column(name = "nbrdeserieDisqueDVDRW")
    private String nbrdeserieDisqueDVDRW;

    @Column(name = "nbrinventaireDisqueDVDRW")
    private String nbrinventaireDisqueDVDRW;

    @Column(name = "marqueDisqueDVDRW")
    private String marqueDisqueDVDRW;

    @Column(name = "modeleDisqueDVDRW")
    private String modeleDisqueDVDRW;

    @Column(name = "capaciteDisqueDVDRW")
    private String capaciteDisqueDVDRW;

    @Column(name = "dateaffectationDisqueDVDRW")
    private String dateaffectationDisqueDVDRW;

    @Column(name = "affectationpersoneDisqueDVDRW")
    private String affectationpersoneDisqueDVDRW;

    @Column(name = "observationDisqueDVDRW")
    private String observationDisqueDVDRW;

    @Column(name = "quantiteDisqueDVDRW")
    private Date quantiteDisqueDVDRW;

}
