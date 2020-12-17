package ua.kpi.dbsample.controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.kpi.dbsample.entities.Bus;
import ua.kpi.dbsample.service.BusModelService;
import ua.kpi.dbsample.service.BusService;

@Controller
@AllArgsConstructor
public class BusController {

  private BusModelService busModelService;
  private BusService busService;

  @GetMapping("/bus-models")
  public String list(Model model) {
    model.addAttribute("result", busModelService.getBusModels());
    return "bus-models";
  }

  @GetMapping("buses")
  public String buses(Model model, @RequestParam(name = "registration" ,required = false) String registration) {
    if(registration == null || "".equals(registration)) {
      model.addAttribute("result", busService.getAllBuses());
    }else{
      List<Bus> buses = busService.findByRegistration(registration);
      model.addAttribute("result", buses );
    }

    return "buses";
  }


}
