package ua.kpi.dbsample.service;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.kpi.dbsample.entities.Bus;
import ua.kpi.dbsample.repositories.BusRepository;

@Service
@AllArgsConstructor
public class BusService {
  private BusRepository busRepository;

  public List<Bus> getAllBuses(){
    return busRepository.findAll();
  }

  public List<Bus> findByRegistration(String registration) {
    return busRepository.findByRegistrationLike("%"+registration+"%");

  }
}
