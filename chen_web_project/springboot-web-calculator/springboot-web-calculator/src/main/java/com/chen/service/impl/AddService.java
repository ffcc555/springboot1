package com.chen.service.impl;

import com.chen.basic.Result;
import com.chen.controller.CalculatorController;
import org.springframework.stereotype.Service;

@Service
public class AddService extends CalculatorController {
    @Override
    public Result compute(double param1, double param2) {

        return Result.ok(param1 + param2);
    }
}