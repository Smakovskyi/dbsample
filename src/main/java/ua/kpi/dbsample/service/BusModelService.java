package ua.kpi.dbsample.service;


import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.kpi.dbsample.entities.BusModel;
import ua.kpi.dbsample.repositories.BusModelRepository;

@Service
@AllArgsConstructor
public class BusModelService {

  private BusModelRepository busModelRepository;

  public List<BusModel> getBusModels(){
    return busModelRepository.findAll();
  }

}
