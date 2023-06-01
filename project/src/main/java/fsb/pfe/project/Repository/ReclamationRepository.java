package fsb.pfe.project.Repository;

// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fsb.pfe.project.Model.Reclamation;

public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
    // Optional<Reclamation> findByIdReclamation(Long idReclamation);

}
