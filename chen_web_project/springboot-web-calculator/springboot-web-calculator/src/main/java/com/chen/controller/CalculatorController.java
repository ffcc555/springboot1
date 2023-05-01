package com.chen.controller;


import com.chen.basic.Result;
import com.chen.service.impl.AddService;
import com.chen.service.impl.MinusService;
import com.chen.service.impl.MultiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public abstract class CalculatorController {
    @Autowired
    private AddService addService;
    @Autowired
    private MinusService minusService;
    @Autowired
    private MultiService multiService;

    @RequestMapping("/add")
    public Result add(double param1, double param2) {
        return addService.compute(param1, param2);
    }

    @RequestMapping("/minus")
    public Result minus(double param1, double param2) {
        return minusService.compute(param1, param2);
    }

    @RequestMapping("/multi")
    public Result multi(double param1, double param2) {
        return multiService.compute(param1, param2);
    }

    public abstract Result compute(double param1, double param2);
}
