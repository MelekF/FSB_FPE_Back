package fsb.pfe.project.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "Stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;

    @Column(name = "dateachatStock")
    private Date dateachatStock;

    @Column(name = "datereceptionStock")
    private Date datereceptionStock;

    @Column(name = "nbrStock")
    private int nbrStock;

    @Column(name = "caracteristiqueStock")
    private String caracteristiqueStock;

    @Column(name = "nbrdeserieStock")
    private String nbrdeserieStock;

    @Column(name = "nbrinventaireStock")
    private String nbrinventaireStock;

    @Column(name = "dateaffectationStock")
    private String dateaffectationStock;

    @Column(name = "affectationpersoneStock")
    private String affectationpersoneStock;

    @Column(name = "observationStock")
    private String observationStock;

    @Column(name = "quantiteStock")
    private Date quantiteStock;

}