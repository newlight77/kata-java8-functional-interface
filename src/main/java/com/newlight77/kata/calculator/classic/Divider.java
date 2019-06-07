package com.newlight77.kata.calculator.classic;

public class Divider implements Calculator<Double> {
    @Override
    public Double calculate(Double a, Double b) {
        return a/b;
    }
}
