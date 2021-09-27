package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void karvonenHR() {
        assertEquals(138, App.karvonenHR(22,65,0.55f));
        assertEquals(178, App.karvonenHR(22,65,0.85f));
        assertEquals(191, App.karvonenHR(22,65,0.95f));
    }
}