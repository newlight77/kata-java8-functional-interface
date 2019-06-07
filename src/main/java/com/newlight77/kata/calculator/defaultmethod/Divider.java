package com.newlight77.kata.calculator.defaultmethod;

public class Divider implements Calculator<Double> {
    @Override
    public Double calculate(Double a, Double b) {
        return divide(a, b);
    }
}
