package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getCar(@RequestParam(required = false) Integer count, Model model) {
        if (count != null && count < 5) {
            model.addAttribute("cars", carService.getCar(count));
        } else {
            model.addAttribute("cars", carService.getAllCar());
        }
        return "cars";
    }
}
