package com.example.calctest;

import com.example.calctest.Exceptions.DivisionByZeroException;
import com.example.calctest.Exceptions.ParamException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DefaultAdvice {

    @ExceptionHandler(DivisionByZeroException.class)
    public String DivisionByZeroExc() {
        return new DivisionByZeroException().getMessage();
    }
    @ExceptionHandler(ParamException.class)
    public String paramExc() {
        return new ParamException().getMessage();
    }
}