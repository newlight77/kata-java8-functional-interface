package com.newlight77.kata.calculator.defaultmethod;

public class Substracter implements Calculator<Double> {
    @Override
    public Double calculate(Double a, Double b) {
        return substract(a, b);
    }
}
