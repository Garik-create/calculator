package com.skypro.calculator.controller;

import com.skypro.calculator.service.NumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumController {
    private final NumService numService;

    public NumController(NumService numService) {
        this.numService = numService;
    }

    @GetMapping("/calculator")
    public String printGreeting() {
        return this.numService.getGreeting();
    }

    @GetMapping("/calculator/plus")
    public String getSum() {
        return this.numService.getSum(5, 5);
    }

    @GetMapping("/calculator/minus")
    public String getDifference() {
        return this.numService.getDifference(5, 5);
    }

    @GetMapping("/calculator/multiply")
    public String gerMultiply() {
        return this.numService.getMultiply(5, 5);
    }

    @GetMapping("/calculator/divide")
    public String getDivision() {
        return this.numService.getDivision(5, 5);
    }
}
