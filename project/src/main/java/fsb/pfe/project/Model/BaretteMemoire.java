package fsb.pfe.project.Model;

import java.sql.Date;


import javax.persistence.*;
import java.sql.Date;


@Entity

@Table(name = "BaretteMemoire")
public class BaretteMemoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBaretteMemoire;

    @Column(name = "dateachatBaretteMemoire")
    private Date dateachatBaretteMemoire;

    @Column(name = "datereceptionBaretteMemoire")
    private Date datereceptionBaretteMemoire;

    @Column(name = "nbrBaretteMemoire")
    private int nbrBaretteMemoire;

    @Column(name = "caracteristiqueBaretteMemoire")
    private String caracteristiqueBaretteMemoire;

    @Column(name = "nbrdeserieBaretteMemoire")
    private String nbrdeserieBaretteMemoire;

    @Column(name = "nbrinventaireBaretteMemoire")
    private String nbrinventaireBaretteMemoire;

    @Column(name = "marqueBaretteMemoire")
    private String marqueBaretteMemoire;

    @Column(name = "modeleBaretteMemoire")
    private String modeleBaretteMemoire;

    @Column(name = "capaciteBaretteMemoire")
    private String capaciteBaretteMemoire;

    @Column(name = "dateaffectationBaretteMemoire")
    private String dateaffectationBaretteMemoire;

    @Column(name = "affectationpersoneBaretteMemoire")
    private String affectationpersoneBaretteMemoire;

    @Column(name = "observationBaretteMemoire")
    private String observationBaretteMemoire;

    @Column(name = "quantiteBaretteMemoire")
    private Date quantiteBaretteMemoire;

}
