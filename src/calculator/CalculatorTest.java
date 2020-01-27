package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addcompute() {
        Assert.assertEquals(10,Calculator.compute("5 + 5"), 0.001);
    }
    @Test
    void multicompute() {
        Assert.assertEquals(12,Calculator.compute("6 * 2"), 0.001);
    }
    @Test
    void dividecompute() {
        Assert.assertEquals(5,Calculator.compute("25 : 5"), 0.01);
    }
    @Test
    void substractcompute() {
        Assert.assertEquals(9,Calculator.compute("5 + 4"), 0.001);
    }


}