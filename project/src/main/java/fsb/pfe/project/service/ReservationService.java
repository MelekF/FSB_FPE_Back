package fsb.pfe.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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
    // public Reservation UpdateReservation(Reservation Reservation) {
    // Reservation existingReservation =
    // ReservationRepository.findById(Reservation.getIdreservation())
    // .orElse(null);
    // existingReservation.setReservationnom(Reservation.getReservationnom());
    // existingReservation.setReservationtel(Reservation.getReservationtel());
    // existingReservation.setReservationemail(Reservation.getReservationemail());
    // existingReservation.setReservationncin(Reservation.getReservationncin());
    // existingReservation.setReservationtype(Reservation.getReservationtype());
    // existingReservation.setReservationsalle(Reservation.getReservationsalle());
    // existingReservation.setReservationmateriel(Reservation.getReservationmateriel());
    // existingReservation.setReservationdate(Reservation.getReservationdate());
    // existingReservation.setReservationheure(Reservation.getReservationheure());

    // return ReservationRepository.save(existingReservation);
    // }////////////////////////////////////////////////////////////////////////////////////////////
    public Reservation UpdateReservation(Long Idreservation, Reservation Reservation) {
        Reservation existingReservation = ReservationRepository.findById(Idreservation).orElse(null);
        if (existingReservation == null) {
            throw new ResourceNotFoundException("Reservation not found with id: " + Idreservation);
        }
        existingReservation.setReservationnom(Reservation.getReservationnom());
        existingReservation.setReservationtel(Reservation.getReservationtel());
        existingReservation.setReservationemail(Reservation.getReservationemail());
        existingReservation.setReservationncin(Reservation.getReservationncin());
        existingReservation.setReservationtype(Reservation.getReservationtype());
        existingReservation.setReservationsalle(Reservation.getReservationsalle());
        existingReservation.setReservationmateriel(Reservation.getReservationmateriel());
        existingReservation.setReservationdate(Reservation.getReservationdate());
        existingReservation.setReservationheure(Reservation.getReservationheure());

        return ReservationRepository.save(existingReservation);
    }

    // public Reservation updateReservation(Long idReservation, Reservation
    // reservation) {
    // reservation.setIdreservation(idReservation);
    // return ReservationRepository.save(reservation);
    // }

}
