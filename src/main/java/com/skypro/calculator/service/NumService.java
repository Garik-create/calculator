package com.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class NumService {


    public String getGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public String getSum(int num1, int num2) {
        int sum = num1 + num2;
        return (num1 + " + " + num2 + " = " + sum);
    }

    public String getDifference(int num1, int num2) {
        int diff = num1 - num2;
        return (num1 + " - " + num2 + " = " + diff);
    }

    public String getMultiply(int num1, int num2) {
        int mult = num1 * num2;
        return (num1 + " * " + num2 + " = " + mult);
    }

    public String getDivision(int num1, int num2) {
        if (num2 != 0) {
            int div = (num1 / num2);
            return (num1 + " / " + num2 + " = " + div);
        } else {
            return ("Деленгие на ноль запрещено!");
        }
    }
}
