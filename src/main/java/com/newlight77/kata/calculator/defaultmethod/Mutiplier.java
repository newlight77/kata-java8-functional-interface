package com.newlight77.kata.calculator.defaultmethod;

public class Mutiplier implements Calculator<Double> {
    @Override
    public Double calculate(Double a, Double b) {
        return multiply(a, b);
    }
}
