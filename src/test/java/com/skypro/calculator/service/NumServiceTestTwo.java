package com.skypro.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumServiceTestTwo {
    private final NumService numService = new NumService();

    @ParameterizedTest
    @MethodSource("testSumMethodWithDifferentParams")
    public void testSumMethod(int num1, int num2, int exp) {
        Assertions.assertEquals(exp, numService.getSum(num1, num2));
    }

    public static Stream<Arguments> testSumMethodWithDifferentParams() {

        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(3, 4, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("testDifferentMethodWithDifferentParams")
    public void testGetDifference(int num1, int num2, int exp) {
        Assertions.assertEquals(exp, numService.getDifference(num1, num2));
    }

    public static Stream<Arguments> testDifferentMethodWithDifferentParams() {

        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(3, 4, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testMultiplyMethodWithDifferentParams")
    public void testGetMultiply(int num1, int num2, int exp) {
        Assertions.assertEquals(exp, numService.getMultiply(num1, num2));
    }

    public static Stream<Arguments> testMultiplyMethodWithDifferentParams() {

        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(3, 4, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("testDivisionMethodWithDifferentParams")
    public void testGetDivision(int num1, int num2, double exp) {
        Assertions.assertEquals(exp, numService.getDivision(num1, num2));
    }

    public static Stream<Arguments> testDivisionMethodWithDifferentParams() {
        return Stream.of(
                Arguments.of(1, 2, 0.5),
                Arguments.of(3, 4, 0.75)
        );
    }
}
