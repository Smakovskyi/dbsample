package ua.kpi.dbsample.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.kpi.dbsample.entities.BusModel;

@Repository
public interface BusModelRepository extends JpaRepository<BusModel, Long> {

}
