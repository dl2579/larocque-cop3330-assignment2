package ex29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testCalculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("validating inputs..")
    void inputToInt() {
        assertAll(() -> assertEquals(0, App.inputToInt( "0")),
                () -> assertEquals(0, App.inputToInt( "abc")),
                () -> assertEquals(2, App.inputToInt( "2")),
                () -> assertEquals(4, App.inputToInt( "4")));
    }
}