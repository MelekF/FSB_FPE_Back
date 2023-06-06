package fsb.pfe.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Reservation> CreateReservation(@RequestBody Reservation Reservation) {
        Reservation newReservation= ReservationService.CreateReservation(Reservation);
        return new ResponseEntity<>(Reservation, HttpStatus.OK);
    }

    //@PostMapping("/addReservations")
    //public List<Reservation> CreateReservations(@RequestBody List<Reservation> Reservation) {
      //  return ReservationService.CreateReservations(Reservation);
    //}
    @GetMapping("/Reservations")
    public ResponseEntity<List<Reservation>> getReservations() {
        List<Reservation> Reservation= ReservationService.getReservations();
        return new ResponseEntity<>(Reservation, HttpStatus.OK);
    }
    @GetMapping("/Reservation/{idReservation}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable("idReservation") Long idReservation) {
        Reservation Reservation= ReservationService.getReservationById(idReservation);
        return new ResponseEntity<>(Reservation, HttpStatus.OK);
    }
   // @PutMapping("/updateReservation/{idReservation}")
    //public ResponseEntity<Reservation> UpdateReservation(@PathVariable Long idReservation, Reservation Reservation) {
      //  Reservation UpdateReservation = ReservationService.UpdateReservation( idReservation,Reservation);
        //return new ResponseEntity<>(UpdateReservation,HttpStatus.OK);

    //}

    @DeleteMapping("/deleteReservation/{idReservation}")
    public  ResponseEntity<?> deleteReservation(@PathVariable("idReservation")Long idReservation)
    {
        ReservationService.DeleteReservation(idReservation);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
