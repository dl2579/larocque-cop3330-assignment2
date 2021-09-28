package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void eightBall() {
        //"Yes", "No", "Maybe", "Ask again later"
        for(int i=0; i<100; i++) {
            String str = App.eightBall();
            assertEquals(true, (str == "Yes" || str == "No" || str == "Maybe" || str == "Ask again later"));
        }

    }
}