package com.example.calctest.service;
import com.example.calctest.Exceptions.DivisionByZeroException;
import com.example.calctest.Exceptions.ParamException;
import com.example.calctest.CalcInterface.CalcInterface;
import org.springframework.stereotype.Service;

@Service

public class CalcService implements CalcInterface {
    @Override
    public String toGreet() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(Integer num1, Integer num2) {
        notNullValidate(num1,num2);
        return num1 + num2;
    }

    @Override
    public int minus ( Integer num1, Integer num2){
        notNullValidate(num1,num2);
        return num1 - num2;
    }

    @Override
    public int multiply ( Integer num1, Integer num2){
        notNullValidate(num1,num2);
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2) throws DivisionByZeroException {
        notNullValidate(num1,num2);
        if(num2 == 0) {
            throw new DivisionByZeroException();
        }
        return (double) num1 / num2;
    }
    private void notNullValidate(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ParamException();
        }
    }
}
