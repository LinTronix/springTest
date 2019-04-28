package com.example.demo.controllers;

import com.example.demo.enums.Calculations;
import com.example.demo.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.awt.geom.RoundRectangle2D;
@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String addition(@RequestParam String x, @RequestParam String y){
        String s = "result " + (Double.parseDouble(x) + Double.parseDouble(y));
        return s;
    }
@Autowired
    CalculatorService calculatorService;

    @PostMapping("/calculate")
    public String calculation(@RequestParam String calculationType, @RequestParam String x, @RequestParam String y){
       return calculatorService.calculate(calculationType,x,y);
    }
}
