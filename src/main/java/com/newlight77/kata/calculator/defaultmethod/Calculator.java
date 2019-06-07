package com.newlight77.kata.calculator.defaultmethod;

interface Calculator<Double> {
    Double calculate(Double a, Double b);
    default double add(double a, double b) {
        return a + b;
    }
    default double substract(double a, double b) {
        return a - b;
    }
    default double multiply(double a, double b) {
        return a * b;
    }
    default double divide(double a, double b) {
        return a / b;
    }
}
