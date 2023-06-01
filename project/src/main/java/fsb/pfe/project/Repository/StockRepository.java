package fsb.pfe.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fsb.pfe.project.Model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
