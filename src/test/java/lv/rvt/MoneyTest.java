package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {
    @Test
    public void testPlusMethod() { // unit test for Mone class #1
        Money newMoney1 = new Money(5, 10);
        Money newMoney2 = new Money(5, 10);
        Money result1 = newMoney1.plus(newMoney2);
        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());
    }

    @Test
    public void testPlusMethod2() { // unit test for Mone class #2
        Money newMoney3 = new Money(2, 89);
        Money newMoney4 = new Money(3, 99);
        Money result2 = newMoney3.plus(newMoney4);
        assertEquals(6, result2.euros());
        assertEquals(88, result2.cents());

    }

    @Test
    public void testPlusMethod3() { // unit test for Mone class #3
        Money newMoney5 = new Money(0, 0);
        Money newMoney6 = new Money(0, 0);
        Money result3 = newMoney5.plus(newMoney6);
        assertEquals(0, result3.euros());
        assertEquals(0, result3.cents());

    }

    @Test
    public void testMinusMethod3() { // unit test for Mone class #4
        Money newMoney7 = new Money(2, 80);
        Money newMoney8 = new Money(1, 90);
        Money result4 = newMoney7.minus(newMoney8);
        assertEquals(0, result4.euros());
        assertEquals(90, result4.cents());

    }

    @Test
    public void testMinusMethod4() { // unit test for Mone class #5
        Money newMoney9 = new Money(3, 80);
        Money newMoney10 = new Money(3, 80);
        Money result5 = newMoney9.minus(newMoney10);
        assertEquals(0, result5.euros());
        assertEquals(0, result5.cents());

    }
}
