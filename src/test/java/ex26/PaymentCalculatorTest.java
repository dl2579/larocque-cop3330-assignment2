package ex26;

import ex25.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertAll(() -> assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(12f, 5000f, 100f)),
                () -> assertEquals(1, PaymentCalculator.calculateMonthsUntilPaidOff(12f, 1000f, 1200f)),
                () -> assertEquals(36, PaymentCalculator.calculateMonthsUntilPaidOff(25f, 5000f, 200f)));
    }
}