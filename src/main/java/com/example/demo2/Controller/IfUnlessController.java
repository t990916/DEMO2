package com.example.demo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/if-unless")
public class IfUnlessController {

    @RequestMapping("")
    public String index(Model model) {
        Car car = new Car();
        car.setSpeed(60);
        model.addAttribute("car", car);
        return "if-unless";
    }
}
