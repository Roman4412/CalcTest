package com.example.calctest.service;


import com.example.calctest.CalcInterface.CalcInterface;
import org.springframework.stereotype.Service;

@Service

public class CalcService implements CalcInterface {
    @Override
    public String toGreet() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}