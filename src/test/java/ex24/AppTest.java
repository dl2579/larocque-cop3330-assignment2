package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testCalculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */

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