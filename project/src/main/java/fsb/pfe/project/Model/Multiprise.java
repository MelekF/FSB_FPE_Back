package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Multiprise")
public class Multiprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMultiprise;

    @Column(name = "datereceptionMultiprise")
    private Date datereceptionMultiprise;

    @Column(name = "quantiteMultiprise")
    private Date nbrtotaleMultiprise;

    @Column(name = "nbrMultiprise")
    private int nbrMultiprise;

    @Column(name = "caracteristiqueMultiprise")
    private String caracteristiqueMultiprise;

    @Column(name = "nbrdeserieMultiprise")
    private String nbrdeserieMultiprise;

    @Column(name = "nbrinventaireMultiprise")
    private String nbrinventaireMultiprise;

    @Column(name = "dateaffectationMultiprise")
    private String dateaffectationMultiprise;

    @Column(name = "affectationpersoneMultiprise")
    private String affectationpersoneMultiprise;

    @Column(name = "observationMultiprise")
    private String observationMultiprise;

}
