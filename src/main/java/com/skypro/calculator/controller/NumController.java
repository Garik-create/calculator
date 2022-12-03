package com.skypro.calculator.controller;

import com.skypro.calculator.exeption.IllegalNumberException;
import com.skypro.calculator.service.NumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class NumController {
    private final NumService numService;

    public NumController(NumService numService) {
        this.numService = numService;
    }

    @ExceptionHandler(value = IllegalNumberException.class)
    public ResponseEntity<String> illegalNumberHandler(IllegalNumberException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }



    @GetMapping("")
    public String printGreeting() {

        return this.numService.getGreeting();
    }

    @GetMapping("/plus")
    public String getSum(@RequestParam("num1") int num1,
                         @RequestParam("num2") int num2) {
        return (num1 + " + " + num2 + " = " + this.numService.getSum(num1, num2));
    }

    @GetMapping("/minus")
    public String getDifference(@RequestParam("num1") int num1,
                                @RequestParam("num2") int num2) {
        return (num1 + " - " + num2 + " = " + this.numService.getDifference(num1, num2));
    }

    @GetMapping("/multiply")
    public String gerMultiply(@RequestParam("num1") int num1,
                              @RequestParam("num2") int num2) {
        return (num1 + " * " + num2 + " = " + this.numService.getMultiply(num1, num2));
    }

    @GetMapping("/divide")
    public String getDivision(@RequestParam("num1") int num1,
                              @RequestParam("num2") int num2) {
        return (num1 + " / " + num2 + " = " + this.numService.getDivision(num1, num2));
    }
}
