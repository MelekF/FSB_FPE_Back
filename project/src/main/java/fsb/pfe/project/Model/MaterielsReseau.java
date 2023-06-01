package fsb.pfe.project.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "MaterielsReseau")
public class MaterielsReseau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaterielsReseau;

    @Column(name = "dateachatMaterielsReseau")
    private Date dateachatMaterielsReseau;

    @Column(name = "datereceptionMaterielsReseau")
    private Date datereceptionMaterielsReseau;

    @Column(name = "articleIOT")
    private int articleIOT;

    @Column(name = "caracteristiqueMaterielsReseau")
    private String caracteristiqueMaterielsReseau;

    @Column(name = "nbrdeserieMaterielsReseau")
    private String nbrdeserieMaterielsReseau;

    @Column(name = "nbrinventaireMaterielsReseau")
    private String nbrinventaireMaterielsReseau;

    @Column(name = "dateaffectationMaterielsReseau")
    private String dateaffectationMaterielsReseau;

    @Column(name = "affectationpersoneMaterielsReseau")
    private String affectationpersoneMaterielsReseau;

    @Column(name = "observationMaterielsReseau")
    private String observationMaterielsReseau;

    @Column(name = "quantiteMaterielsReseau")
    private Date quantiteMaterielsReseau;

}
