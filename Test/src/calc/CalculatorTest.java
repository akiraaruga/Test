package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calcuator=new Calculator();
        assertEquals(4,calcuator.add(2,3));
    }

    @Test
    void testSubtract() {
        Calculator calculator=new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
    }

}
