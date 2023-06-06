package fsb.pfe.project.Model;
import javax.persistence.*;
import java.sql.Date;


@Entity

@Table(name = "MaterielsIOT")
public class MaterielsIOT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaterielsIOT;

    @Column(name = "dateachatMaterielsIOT")
    private Date dateachatMaterielsIOT;

    @Column(name = "datereceptionMaterielsIOT")
    private Date datereceptionMaterielsIOT;

    @Column(name = "articleIOT")
    private int articleIOT;

    @Column(name = "caracteristiqueMaterielsIOT")
    private String caracteristiqueMaterielsIOT;

    @Column(name = "nbrdeserieMaterielsIOT")
    private String nbrdeserieMaterielsIOT;

    @Column(name = "nbrinventaireMaterielsIOT")
    private String nbrinventaireMaterielsIOT;

    @Column(name = "dateaffectationMaterielsIOT")
    private String dateaffectationMaterielsIOT;

    @Column(name = "affectationpersoneMaterielsIOT")
    private String affectationpersoneMaterielsIOT;

    @Column(name = "observationMaterielsIOT")
    private String observationMaterielsIOT;

    @Column(name = "quantiteMaterielsIOT")
    private Date quantiteMaterielsIOT;

}
