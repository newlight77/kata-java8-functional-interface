# kata-java8-functional-interface

This kata aims to show how to work with functional interface (`@FunctionalInterface`).

This the java 7 or older way :

```java
interface Calculator<Double> {
    Double calculate(Double a, Double b);
}

public class Adder implements Calculator<Double> {
    @Override
    public Double calculate(Double a, Double b) {
        return a+b;
    }
}

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
}
```

With Java8 with functional interface and lambda :

```java
@FunctionalInterface
interface CalculatorFunctional<T> {
    T calculate(T a, T b);
}

class CalculatorLambda<T> {
    public T calculate(T a, T b, CalculatorFunctional<T> functional) {
        return (T) functional.calculate(a, b);
    }
}

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
}
```