package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addingNums() {
        assertAll(() -> assertEquals(15, App.addingNums(1,2,3,4,5)),
                () -> assertEquals(-15, App.addingNums(-1,-2,-3,-4,-5)),
                () -> assertEquals(0, App.addingNums(0,0,0,0,0)),
                () -> assertEquals(3, App.addingNums(-1,-2,-3,4,5))
        );
    }
}