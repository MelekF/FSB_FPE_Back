package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Clavier")
public class Clavier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClavier;

    @Column(name = "dateachatClavier")
    private Date dateachatClavier;

    @Column(name = "datereceptionClavier")
    private Date datereceptionClavier;

    @Column(name = "nbrClavier")
    private int nbrClavier;

    @Column(name = "caracteristiqueClavier")
    private String caracteristiqueClavier;

    @Column(name = "nbrdeserieClavier")
    private String nbrdeserieClavier;

    @Column(name = "nbrinventaireClavier")
    private String nbrinventaireClavier;

    @Column(name = "marqueClavier")
    private String marqueClavier;

    @Column(name = "modeleClavier")
    private String modeleClavier;

    @Column(name = "connexionClavier")
    private String connexionClavier;

    @Column(name = "dateaffectationClavier")
    private String dateaffectationClavier;

    @Column(name = "affectationpersoneClavier")
    private String affectationpersoneClavier;

    @Column(name = "observationClavier")
    private String observationClavier;

    @Column(name = "quantiteClavier")
    private Date quantiteClavier;

}
