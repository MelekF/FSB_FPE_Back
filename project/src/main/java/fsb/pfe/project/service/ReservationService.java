package fsb.pfe.project.service;

import java.util.List;
import java.util.Optional;

import fsb.pfe.project.Exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fsb.pfe.project.Model.Reservation;
import fsb.pfe.project.Repository.ReservationRepository;

@Service

public class ReservationService {
    @Autowired
    private ReservationRepository ReservationRepository;

    // Cree un Reservation
    public Reservation CreateReservation(Reservation Reservation) {
        return ReservationRepository.save(Reservation);
    }

    // Cree des Reservations
    public List<Reservation> CreateReservations(List<Reservation> Reservation) {
        return ReservationRepository.saveAll(Reservation);
    }

    // get Reservations

    public List<Reservation> getReservations() {
        return ReservationRepository.findAll();
    }

    // get Reservation By Id
    public Reservation getReservationById(Long idReservation) {
        return ReservationRepository.findById(idReservation).orElse(null);
    }

    // Delete Reservation
    public String DeleteReservation(Long idReservation) {
        ReservationRepository.deleteById(idReservation);
        return "Reservation Removed !!" + idReservation;
    }

    // UpDate Reservation
   // public ResponseEntity<Reservation> UpdateReservation(Long reservationId, Reservation Reservation) {
    //   Optional<Reservation> existingReservation = ReservationRepository.findById(reservationId);
    //   if (existingReservation.isPresent()) {
    //      Reservation updatedReservation = existingReservation.get();

    //       existingReservation.setReservationnom(Reservation.getReservationnom());
    //  existingReservation.setReservationtel(Reservation.getReservationtel());
//    existingReservation.setReservationemail(Reservation.getReservationemail());
    //   existingReservation.setReservationncin(Reservation.getReservationncin());
    //   existingReservation.setReservationsalle(Reservation.getReservationsalle());
    //  existingReservation.setReservationmateriel(Reservation.getReservationmateriel());
    //    existingReservation.setReservationdate(Reservation.getReservationdate());


    //    ReservationRepository.saveAndFlush(updatedReservation);

            // Return the updated Reservation.
    // return ResponseEntity.ok(updatedReservation);
    // } else {
            // Reservation does not exist.
    //    return ResponseEntity.notFound().build();
       // }
        // //////////////////////////////////////////////////////////////////////////////////////////
    //public Reservation UpdateReservation
  //  (Long idReservation ,Reservation Reservation) {

   //     return ReservationRepository.save(Reservation);
 //   }

     public Reservation updateReservation(Long idReservation, Reservation
    reservation) {
     reservation.setIdreservation(idReservation);
     return ReservationRepository.save(reservation);
    }

}
