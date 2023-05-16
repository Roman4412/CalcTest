package com.example.calctest.CalcInterface;

import Exceptions.DivisionByZeroException;

public interface CalcInterface {
    String toGreet();

    int plus(Integer num1, Integer num2);

    int minus(Integer num1, Integer num2);

    int multiply(Integer num1, Integer num2);

    double divide(Integer num1, Integer num2) throws DivisionByZeroException;
}