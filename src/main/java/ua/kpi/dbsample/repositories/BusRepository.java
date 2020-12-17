package ua.kpi.dbsample.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.kpi.dbsample.entities.Bus;

public interface BusRepository extends JpaRepository<Bus,Long> {

  List<Bus> findByRegistrationLike(String registration);

  //@Query("SELECT Bus FROM Bus WHERE Bus.registration LIKE :registration ")
  //List<Bus> findByNumber(@Param("registration") String registration);
}
