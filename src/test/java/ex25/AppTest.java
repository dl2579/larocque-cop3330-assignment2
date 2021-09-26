package ex25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testCalculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("password strength test")
    void passwordValidator() {
        assertAll(() -> assertEquals(1, App.passwordValidator("12345")),
                () -> assertEquals(2, App.passwordValidator("abcdef")),
                () -> assertEquals(3, App.passwordValidator("abc123xyz")),
                () -> assertEquals(4, App.passwordValidator("1337h@xor!")));
    }
}