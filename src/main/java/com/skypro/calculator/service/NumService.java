package com.skypro.calculator.service;

import com.skypro.calculator.exeption.IllegalNumberException;
import org.springframework.stereotype.Service;

@Service
public class NumService {


    public String getGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public int getDifference(int num1, int num2) {
        return num1 - num2;
    }

    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public double getDivision(int num1, int num2) {
        if (num2 != 0) {
            return (double)num1 / num2;
        } else {
            throw new IllegalNumberException("Делить на ноль нельзя!");
        }
    }
}
