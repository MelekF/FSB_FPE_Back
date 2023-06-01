package fsb.pfe.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fsb.pfe.project.Model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
