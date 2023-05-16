package com.example.calctest.controller;

import com.example.calctest.CalcInterface.CalcInterface;
import com.example.calctest.DefaultAdvice;
import com.example.calctest.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    CalcInterface serviceInterface = new CalcService();

    @GetMapping()
    public String toGreet() {
        return serviceInterface.toGreet();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num2 == null || num1 == null) {
            return "Отсутствует один из аргументов";
        } else {
            return String.format("%d + %d = %d", num1, num2, serviceInterface.plus(num1, num2));
        }
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num2 == null || num1 == null) {
            return "Отсутствует один из аргументов";
        } else {
            return String.format("%d - %d = %d", num1, num2, serviceInterface.minus(num1, num2));
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num2 == null || num1 == null) {
            return "Отсутствует один из аргументов";
        } else {
            return String.format("%d * %d = %d", num1, num2, serviceInterface.multiply(num1, num2));
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return String.format("%d / %d = %d", num1, num2, serviceInterface.divide(num1, num2));
    }
}