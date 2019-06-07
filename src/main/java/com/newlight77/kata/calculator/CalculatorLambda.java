package com.newlight77.kata.calculator;

class CalculatorLambda<T> {
    public T calculate(T a, T b, CalculatorFunctional<T> functional) {
        return (T) functional.calculate(a, b);
    }
}
