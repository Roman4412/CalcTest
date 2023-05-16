package com.example.calctest;

import com.example.calctest.Exceptions.DivisionByZeroException;
import com.example.calctest.Exceptions.ParamException;
import com.example.calctest.service.CalcService;
import org.junit.jupiter.api.Test;

import static com.example.calctest.CalcServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalcMethodsTest {
    private final CalcService calcService = new CalcService();
    @Test
    public void plusTest() {

        int actual = calcService.plus(POSITIVE_NUMBER,NEGATIVE_NUMBER);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void plusExceptionTest() {
        Exception exception = assertThrows(ParamException.class, () ->
                calcService.plus(POSITIVE_NUMBER,NULL));
        assertEquals(NULL_MESSAGE,exception.getMessage());
    }

    @Test
    public void minusTest() {
        int actual =  calcService.minus(POSITIVE_NUMBER,NEGATIVE_NUMBER);
        int expected = 4;
        assertEquals(expected,actual);
    }
    @Test
    public void minusExceptionTest() {
        Exception exception = assertThrows(ParamException.class, () ->
                calcService.minus(POSITIVE_NUMBER,NULL));
        assertEquals(NULL_MESSAGE,exception.getMessage());
    }

    @Test
    public void multiplyTest() {
        int actual =  calcService.multiply(NEGATIVE_NUMBER,POSITIVE_NUMBER);
        int expected = -4;
        assertEquals(expected,actual);
    }
    @Test
    public void multiplyExceptionTest() {
        Exception exception = assertThrows(ParamException.class, () ->
                calcService.multiply(POSITIVE_NUMBER,NULL));
        assertEquals(NULL_MESSAGE,exception.getMessage());
    }

    @Test
    public void divideTest() {
        double actual =  calcService.divide(POSITIVE_NUMBER,NEGATIVE_NUMBER);
        int expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    public void divideExceptionTest() {
        Exception exception = assertThrows(DivisionByZeroException.class, () ->
                calcService.divide(POSITIVE_NUMBER,ZERO));
        assertEquals(BY_ZERO_MESSAGE,exception.getMessage());


    }
}
