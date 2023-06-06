package fsb.pfe.project.Model;

import javax.persistence.*;
import java.sql.Date;


@Entity

@Table(name = "reclamation")
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreclamation;

    @Column(name = "reclamationtype")
    private String reclamationtype;

    @Column(name = "reclamationdescription")
    private String reclamationdescription;

    @Column(name = "reclamationnom")
    private String reclamationnom;

    @Column(name = "reclamationsalle")
    private String reclamationsalle;

    @Column(name = "reclamationpc")
    private String reclamationpc;

    @Column(name = "reclamationdate")
    private String reclamationdate;

    @Column(name = "reclamationheure")
    private String reclamationheure;

    @Column(name = "reclamationetat")
    private String reclamationetat;

    public Long getIdreclamation() {
        return idreclamation;
    }

    public Reclamation() {
    }

    public Reclamation(Long idreclamation, String reclamationtype, String reclamationdescription, String reclamationnom,
            String reclamationsalle, String reclamationpc, String reclamationdate, String reclamationheure,
            String reclamationetat) {
        this.idreclamation = idreclamation;
        this.reclamationtype = reclamationtype;
        this.reclamationdescription = reclamationdescription;
        this.reclamationnom = reclamationnom;
        this.reclamationsalle = reclamationsalle;
        this.reclamationpc = reclamationpc;
        this.reclamationdate = reclamationdate;
        this.reclamationheure = reclamationheure;
        this.reclamationetat = reclamationetat;
    }

    public void setIdreclamation(Long idreclamation) {
        this.idreclamation = idreclamation;
    }

    public String getReclamationtype() {
        return reclamationtype;
    }

    public void setReclamationtype(String reclamationtype) {
        this.reclamationtype = reclamationtype;
    }

    public String getReclamationdescription() {
        return reclamationdescription;
    }

    public void setReclamationdescription(String reclamationdescription) {
        this.reclamationdescription = reclamationdescription;
    }

    public String getReclamationnom() {
        return reclamationnom;
    }

    public void setReclamationnom(String reclamationnom) {
        this.reclamationnom = reclamationnom;
    }

    public String getReclamationsalle() {
        return reclamationsalle;
    }

    public void setReclamationsalle(String reclamationsalle) {
        this.reclamationsalle = reclamationsalle;
    }

    public String getReclamationpc() {
        return reclamationpc;
    }

    public void setReclamationpc(String reclamationpc) {
        this.reclamationpc = reclamationpc;
    }

    public String getReclamationdate() {
        return reclamationdate;
    }

    public void setReclamationdate(String reclamationdate) {
        this.reclamationdate = reclamationdate;
    }

    public String getReclamationheure() {
        return reclamationheure;
    }

    public void setReclamationheure(String reclamationheure) {
        this.reclamationheure = reclamationheure;
    }

    public String getReclamationetat() {
        return reclamationetat;
    }

    public void setReclamationetat(String reclamationetat) {
        this.reclamationetat = reclamationetat;
    }
}
