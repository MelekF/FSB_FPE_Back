package fsb.pfe.project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreservation;

    @Column(name = "reservationnom")
    private String reservationnom;

    @Column(name = "reservationtel")
    private String reservationtel;

    @Column(name = "reservationemail")
    private String reservationemail;

    @Column(name = "reservationncin")
    private String reservationncin;

    @Column(name = "reservationtype")
    private String reservationtype;

    @Column(name = "reservationsalle")
    private String reservationsalle;

    @Column(name = "reservationemateriel")
    private String reservationmateriel;

    @Column(name = "reservationdate")
    private String reservationdate;

    @Column(name = "reservationheure")
    private String reservationheure;

    public Long getIdreservation() {
        return idreservation;
    }

    public Reservation() {
    }

    public Reservation(Long idreservation, String reservationnom, String reservationtel, String reservationemail,
            String reservationncin, String reservationtype, String reservationsalle, String reservationmateriel,
            String reservationdate, String reservationheure) {
        this.idreservation = idreservation;
        this.reservationnom = reservationnom;
        this.reservationtel = reservationtel;
        this.reservationemail = reservationemail;
        this.reservationncin = reservationncin;
        this.reservationtype = reservationtype;
        this.reservationsalle = reservationsalle;
        this.reservationmateriel = reservationmateriel;
        this.reservationdate = reservationdate;
        this.reservationheure = reservationheure;
    }

    public Reservation(Long idreservation) {
        this.idreservation = idreservation;
    }

    public void setIdreservation(Long idreservation) {
        this.idreservation = idreservation;
    }

    public String getReservationnom() {
        return reservationnom;
    }

    public void setReservationnom(String reservationnom) {
        this.reservationnom = reservationnom;
    }

    public String getReservationtel() {
        return reservationtel;
    }

    public void setReservationtel(String reservationtel) {
        this.reservationtel = reservationtel;
    }

    public String getReservationemail() {
        return reservationemail;
    }

    public void setReservationemail(String reservationemail) {
        this.reservationemail = reservationemail;
    }

    public String getReservationncin() {
        return reservationncin;
    }

    public void setReservationncin(String reservationncin) {
        this.reservationncin = reservationncin;
    }

    public String getReservationtype() {
        return reservationtype;
    }

    public void setReservationtype(String reservationtype) {
        this.reservationtype = reservationtype;
    }

    public String getReservationsalle() {
        return reservationsalle;
    }

    public void setReservationsalle(String reservationsalle) {
        this.reservationsalle = reservationsalle;
    }

    public String getReservationmateriel() {
        return reservationmateriel;
    }

    public void setReservationmateriel(String reservationmateriel) {
        this.reservationmateriel = reservationmateriel;
    }

    public String getReservationdate() {
        return reservationdate;
    }

    public void setReservationdate(String reservationdate) {
        this.reservationdate = reservationdate;
    }

    public String getReservationheure() {
        return reservationheure;
    }

    public void setReservationheure(String reservationheure) {
        this.reservationheure = reservationheure;
    }

}
