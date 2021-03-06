package fun;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        Dollar five = new Dollar(5);
        assertEquals(five, new Dollar(5));
        assertNotEquals(five, new Dollar(10));
    }
}
