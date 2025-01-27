package com.example.demo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("/vatiable-expressions")
public class VariableExpressionsController {

    @RequestMapping("")
    public String index(Model model){

        // String javascriptStr = "<span><script>alert('XSSの脆弱性あり');</script>"
        model.addAttribute("name", "伊賀将之");

        Car car = new Car();
        model.addAttribute("car", car );//"car"
                return "variable-expressions";
    }
}
