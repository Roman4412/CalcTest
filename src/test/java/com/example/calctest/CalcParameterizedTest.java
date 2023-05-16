package com.example.calctest;

import com.example.calctest.service.CalcService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalcParameterizedTest {
    private final CalcService out = new CalcService();

    public static Stream <Arguments> paramsForPlusTest() {
        return  Stream.of(
                Arguments.of(2,-2,0),
                Arguments.of(4,5,9));
    }
    public static Stream <Arguments> paramsForMinusTest() {
        return  Stream.of(
                Arguments.of(10,2,8),
                Arguments.of(4,5,-1));
    }
    public static Stream <Arguments> paramsForMultiplyTest() {
        return  Stream.of(
                Arguments.of(4,5,20),
                Arguments.of(10,12,120));
    }
    public static Stream <Arguments> paramsForDivideTest() {
        return  Stream.of(
                Arguments.of(20,5,4),
                Arguments.of(10,2,5));
    }
    @ParameterizedTest
    @MethodSource("paramsForPlusTest")
    public void plusTest(int num1, int num2, int excepted) {
        int result = out.plus(num1,num2);
        assertEquals(result,excepted);
    }
    @ParameterizedTest
    @MethodSource("paramsForMinusTest")
    public void minusTest(int num1, int num2, int excepted) {
        int result = out.minus(num1,num2);
        assertEquals(result,excepted);
    }
    @ParameterizedTest
    @MethodSource("paramsForMultiplyTest")
    public void multiplyTest(int num1, int num2, int excepted) {
        int result = out.multiply(num1,num2);
        assertEquals(result,excepted);
    }
    @ParameterizedTest
    @MethodSource("paramsForDivideTest")
    public void divideTest(int num1, int num2, int excepted) {
        double result = out.divide(num1,num2);
        assertEquals(result,excepted);
    }

}
