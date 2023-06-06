package fsb.pfe.project.Model;

import javax.persistence.*;
import java.sql.Date;


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
