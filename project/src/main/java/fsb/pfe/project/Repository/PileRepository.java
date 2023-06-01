package fsb.pfe.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fsb.pfe.project.Model.Pile;

public interface PileRepository extends JpaRepository<Pile, Long> {

}