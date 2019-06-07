package com.newlight77.kata.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorLambdaTest {

    @Test
    public void shouldReturnSumOf2Numbers() {
        // arrange
        CalculatorFunctional<Double> adder = Double::sum;

        // act
        double result = new CalculatorLambda<Double>().calculate(12.0, 3.0, adder);

        // assert
        Assertions.assertThat(result).isEqualTo(15);
    }

    @Test
    public void shouldReturnDifferenceOf2Numbers() {
        // arrange
        CalculatorFunctional<Double> adder = (a, b) -> a - b;

        // act
        double result = new CalculatorLambda<Double>().calculate(12.0, 3.0, adder);

        // assert
        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    public void shouldReturnProductOf2Numbers() {
        // arrange
        CalculatorFunctional<Double> adder = (a, b) -> a * b;

        // act
        double result = new CalculatorLambda<Double>().calculate(12.0, 3.0, adder);

        // assert
        Assertions.assertThat(result).isEqualTo(36);
    }

    @Test
    public void shouldReturnDivisionOf2Numbers() {
        // arrange
        CalculatorFunctional<Double> adder = (a, b) -> a / b;

        // act
        double result = new CalculatorLambda<Double>().calculate(12.0, 3.0, adder);

        // assert
        Assertions.assertThat(result).isEqualTo(4);
    }
}
