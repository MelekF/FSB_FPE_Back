package fsb.pfe.project.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Adaptateur")
public class Adaptateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdaptateur;
    @Column(name = "dateachatAdaptateur")
    private Date dateachatAdaptateur;
    @Column(name = "datereceptionAdaptateur")
    private Date datereceptionAdaptateur;
    //@Column(name = "nbrAdaptateur")
   // private int nbrAdaptateur;
    @Column(name = "caracteristiqueAdaptateur")
    private String caracteristiqueAdaptateur;
    @Column(name = "nbrdeserieAdaptateur")
    private String nbrdeserieAdaptateur;
    @Column(name = "nbrinventaireAdaptateur")
    private String nbrinventaireAdaptateur;
    @Column(name = "dateaffectationAdaptateur")
    private String dateaffectationAdaptateur;
    @Column(name = "affectationpersoneAdaptateur")
    private String affectationpersoneAdaptateur;
    @Column(name = "observationAdaptateur")
    private String observationAdaptateur;
    @Column(name = "quantiteAdaptateur")
    private Date quantiteAdaptateur;


}
