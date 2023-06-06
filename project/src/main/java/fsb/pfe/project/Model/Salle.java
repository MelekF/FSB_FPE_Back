package fsb.pfe.project.Model;

import javax.persistence.*;
import java.sql.Date;


@Entity

@Table(name = "Salle")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsalle;

    @Column(name = "sallenom")
    private String sallenom;

    @Column(name = "salledep")
    private String salledep;

    @Column(name = "sallenbrpc")
    private int sallenbrpc;

    @Column(name = "salleprisenbr")
    private int salleprisenbr;

    @Column(name = "salleprisenbrfonctionnelle")
    private int salleprisenbrfonctionnelle;

    @Column(name = "salleprisenbrnonfonctionnelle")
    private int salleprisenbrnonfonctionnelle;

    @Column(name = "salleclimatiseur")
    private boolean salleclimatiseur;

    @Column(name = "salleprojecteur")
    private boolean salleprojecteur;

    @Column(name = "salleswitch")
    private boolean salleswitch;

    @Column(name = "salleonduleur")
    private boolean salleonduleur;

    @Column(name = "salletypetableau")
    private String salletypetableau;

    @Column(name = "salleresponsable")
    private String salleresponsable;

    @Column(name = "sallemaintenance")
    private String sallemaintenance;

    @Column(name = "sallenbrtable")
    private int sallenbrtable;

    @Column(name = "sallenbrchair")
    private int sallenbrchair;
}
