package fsb.pfe.project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fsb.pfe.project.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByIduser(Long iduser);
}
