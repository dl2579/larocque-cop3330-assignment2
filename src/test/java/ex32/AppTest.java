package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void randomGen() {

        for(int i=0; i<10; i++) {
            int dif1 = App.randomGen(1);
            assertEquals(true, (dif1 <= 10 && dif1 >= 1));

            int dif2 = App.randomGen(2);
            assertEquals(true, (dif2 <= 100 && dif1 >= 1));

            int dif3 = App.randomGen(3);
            assertEquals(true, (dif3 <= 1000 && dif1 >= 1));
        }
    }
}