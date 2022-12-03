package com.skypro.calculator.service;

import com.skypro.calculator.exeption.IllegalNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class NumServiceTest {
    private final NumService numService = new NumService();



    @Test
    public void testSumMethod() {
        int expected = 5 + 3;
        int actual = numService.getSum(5, 3);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testGetDifferenceMethod() {
        int expected = 10 - 7;
        int actual = numService.getDifference(10, 7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplyMethod() {
        int expected = 10 * 3;
        int actual = numService.getMultiply(10, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetDivisionMethod() {
        int exp = 30 / 5;
        var act = numService.getDivision(30, 5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testExceptionByGetDivisionMethod(){
        Assertions.assertThrows(IllegalNumberException.class, () -> {
            numService.getDivision(5, 0);
        });
    }


}
