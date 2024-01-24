package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.Money;
import rvt.PaymentCard;
import rvt.PaymentTerminal;

public class PayTTest {
    @Test
    public void testAddMethod() { // unit test for Mone class #1
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        PaymentCard annesCard = new PaymentCard(2);
        unicafeExactum.addMoneyToCard(annesCard, 100);
        assertEquals(102, annesCard.balance());
    }
}
