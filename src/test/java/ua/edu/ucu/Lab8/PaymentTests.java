package ua.edu.ucu.Lab8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.lab.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.lab.payment.PayPalPaymentStrategy;
import ua.edu.ucu.lab.payment.Payment;

public class PaymentTests {

    @Test
    public void testPayPalPayment() {
        PayPalPaymentStrategy ppps = new PayPalPaymentStrategy(10);
        Assertions.assertTrue(ppps instanceof Payment);
        Assertions.assertEquals(ppps.getPrice(), 10);
        Assertions.assertFalse(ppps.getIsFullyPayed());
        ppps.pay(7);
        Assertions.assertFalse(ppps.getIsFullyPayed());
        ppps.pay(3);
        Assertions.assertTrue(ppps.getIsFullyPayed());
        ppps.setPrice(15);
        Assertions.assertFalse(ppps.getIsFullyPayed());
        ppps.pay(5);
        Assertions.assertTrue(ppps.getIsFullyPayed());
    }

    @Test
    public void testCreditCardPayment() {
        CreditCardPaymentStrategy ccps = new CreditCardPaymentStrategy(10);
        Assertions.assertTrue(ccps instanceof Payment);
        Assertions.assertEquals(ccps.getPrice(), 10);
        Assertions.assertFalse(ccps.getIsFullyPayed());
        ccps.pay(7);
        Assertions.assertFalse(ccps.getIsFullyPayed());
        ccps.pay(3);
        Assertions.assertTrue(ccps.getIsFullyPayed());
        ccps.setPrice(15);
        Assertions.assertFalse(ccps.getIsFullyPayed());
        ccps.pay(5);
        Assertions.assertTrue(ccps.getIsFullyPayed());
    }

}
