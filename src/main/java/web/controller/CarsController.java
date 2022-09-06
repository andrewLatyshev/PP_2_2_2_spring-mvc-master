package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(Model model, @RequestParam(value = "count", required = false, defaultValue = "0") Integer count) {
        List<Car> carList;
        if (count == null) {
            carList = carService.getAllList();
        } else {
            carList = carService.getCarSubList(count);
        }
        model.addAttribute("cars", carList);
        return "cars";
    }

}
