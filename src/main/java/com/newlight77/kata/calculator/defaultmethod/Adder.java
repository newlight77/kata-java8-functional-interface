package com.newlight77.kata.calculator.defaultmethod;

public class Adder implements Calculator<Double> {
    @Override
    public Double calculate(Double a, Double b) {
        return add(a, b);
    }
}
