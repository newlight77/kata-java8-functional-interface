package com.newlight77.kata.calculator.defaultmethod;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorDefaultMethodTest {

    @Test
    public void shouldReturnSumOf2Numbers() {
        // arrange
        Calculator<Double> adder = new Adder();

        // act
        double result = adder.calculate(12.0, 3.0);

        // assert
        Assertions.assertThat(result).isEqualTo(15);
    }

    @Test
    public void shouldReturnDifferenceOf2Numbers() {
        // arrange
        Calculator<Double> substracter = new Substracter();

        // act
        double result = substracter.calculate(12.0, 3.0);

        // assert
        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    public void shouldReturnProductOf2Numbers() {
        // arrange
        Calculator<Double> multiplier = new Mutiplier();

        // act
        double result = multiplier.calculate(12.0, 3.0);

        // assert
        Assertions.assertThat(result).isEqualTo(36);
    }

    @Test
    public void shouldReturnDivisionOf2Numbers() {
        // arrange
        Calculator<Double> divider = new Divider();

        // act
        double result = divider.calculate(12.0, 3.0);

        // assert
        Assertions.assertThat(result).isEqualTo(4);
    }
}
