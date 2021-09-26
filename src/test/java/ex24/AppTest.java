package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testCalculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Comparing 2 strings")
    void isAnagram() {
        assertEquals(true, App.isAnagram("note","tone"));

        assertAll(() -> assertEquals(true, App.isAnagram("note","tone")),
                () -> assertEquals(false, App.isAnagram("fact","factor")),
                () -> assertEquals(false, App.isAnagram("spade","spare")));
    }


}