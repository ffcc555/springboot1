package com.chen.service;

import com.chen.basic.Result;

public interface Calculator {
    public interface CalculatorController {
        Result compute(double param1, double param2);
    }


}
