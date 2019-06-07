package com.newlight77.kata.calculator;

@FunctionalInterface
interface CalculatorFunctional<T> {
    T calculate(T a, T b);
}
