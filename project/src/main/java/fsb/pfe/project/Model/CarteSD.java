package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "CarteSD")
public class CarteSD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarteSD;

    @Column(name = "dateachatCarteSD")
    private Date dateachatCarteSD;

    @Column(name = "datereceptionCarteSD")
    private Date datereceptionCarteSD;

    @Column(name = "nbrCarteSD")
    private int nbrCarteSD;

    @Column(name = "caracteristiqueCarteSD")
    private String caracteristiqueCarteSD;

    @Column(name = "nbrdeserieCarteSD")
    private String nbrdeserieCarteSD;

    @Column(name = "nbrinventaireCarteSD")
    private String nbrinventaireCarteSD;

    @Column(name = "marqueCarteSD")
    private String marqueCarteSD;

    @Column(name = "modeleCarteSD")
    private String modeleCarteSD;

    @Column(name = "capaciteCarteSD")
    private String capaciteCarteSD;

    @Column(name = "dateaffectationCarteSD")
    private String dateaffectationCarteSD;

    @Column(name = "affectationpersoneCarteSD")
    private String affectationpersoneCarteSD;

    @Column(name = "observationCarteSD")
    private String observationCarteSD;

    @Column(name = "quantiteCarteSD")
    private Date quantiteCarteSD;

}
