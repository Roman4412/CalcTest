package com.example.calctest;

import Exceptions.DivisionByZeroException;
import Exceptions.ParamException;
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