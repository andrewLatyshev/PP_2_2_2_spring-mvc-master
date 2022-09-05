package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Controller
//public class CarsController {
//
//    private CarService carService;
//
//    @GetMapping(value = "/cars")
//    public String getCar(Model model, @RequestParam(value = "5") Integer count) {
//        List<Car> carData;
//        if (count == null) {
//            carData = carService.getAllList();
//        } else {
//            carData = carService.getCarSubList(count);
//        }
//        model.addAttribute("cars", carData);
//        return "cars";
//    }
//
//}
