package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsb.pfe.project.Model.Reservation;
import fsb.pfe.project.service.ReservationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ReservationController {
    @Autowired

    private ReservationService ReservationService;

    @PostMapping("/addReservation")
    public Reservation CreateReservation(@RequestBody Reservation Reservation) {
        return ReservationService.CreateReservation(Reservation);
    }

    @PostMapping("/addReservations")
    public List<Reservation> CreateReservations(@RequestBody List<Reservation> Reservation) {
        return ReservationService.CreateReservations(Reservation);
    }

    @GetMapping("/Reservations")
    public List<Reservation> getReservations() {
        return ReservationService.getReservations();

    }

    @GetMapping("/Reservation/{idReservation}")
    public Reservation getReservationById(@PathVariable Long idReservation) {
        return ReservationService.getReservationById(idReservation);
    }

    // @PutMapping("/updateReservation")
    // public Reservation UpdateReservation(@RequestBody Reservation Reservation) {
    // return ReservationService.UpdateReservation(Reservation);
    // }/////////////////////////////////////////////////////////////////////////
    // @PutMapping("/updateReservation/{idReservation}")
    // public Reservation UpdateReservation(@RequestBody Long idReservation,
    // Reservation Reservation) {
    // return ReservationService.UpdateReservation(idReservation, Reservation);
    // }

    @PutMapping("/updateReservation/{idReservation}")
    public ResponseEntity<Reservation> UpdateReservation(@PathVariable("idReservation") Long idReservation,
            @RequestBody Reservation Reservation) {
        Reservation UpdateReservation = ReservationService.UpdateReservation(idReservation, Reservation);
        return ResponseEntity.ok(UpdateReservation);
    }

    @DeleteMapping("/deleteReservation/{idReservation}")
    public String DeleteReservation(@PathVariable Long idReservation) {
        return ReservationService.DeleteReservation(idReservation);
    }

}
