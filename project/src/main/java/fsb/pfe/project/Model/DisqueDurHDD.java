package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "DisqueDurHDD")
public class DisqueDurHDD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddisquedurHDD;

    @Column(name = "dateachatDisqueDurHDD")
    private Date dateachatDisqueDurHDD;

    @Column(name = "datereceptionDisqueDurHDD")
    private Date datereceptionDisqueDurHDD;

    @Column(name = "caracteristiqueDisqueDurHDD")
    private String caracteristiqueDisqueDurHDD;

    @Column(name = "nbrdisquedurHDD")
    private int nbrdisquedurHDD;

    @Column(name = "nbrdeseriedisquedurHDD")
    private String nbrdeseriedisquedurHDD;

    @Column(name = "nbrinventairedisquedurHDD")
    private String nbrinventairedisquedurHDD;

    @Column(name = "marquedisquedurHDD")
    private String marquedisquedurHDD;

    @Column(name = "modeledisquedurHDD")
    private String modeledisquedurHDD;

    @Column(name = "capacitedisquedurHDD")
    private String capacitedisquedurHDD;

    @Column(name = "dateaffectationdisquedurHDD")
    private String dateaffectationdisquedurHDD;

    @Column(name = "affectationpersonedisquedurHDD")
    private String affectationpersonedisquedurHDD;

    @Column(name = "observationdisquedurHDD")
    private String observationdisquedurHDD;

    @Column(name = "quantitedisquedurHDD")
    private Date quantitedisquedurHDD;

}
