package com.example.calctest.Exceptions;

public class ParamException extends IllegalArgumentException {
    public ParamException() {
        super("Отсутствует параметр");
    }
}
