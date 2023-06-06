package fsb.pfe.project.Repository;

import fsb.pfe.project.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import fsb.pfe.project.Model.Reservation;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional<Reservation> findById(Long reservationId);

}
