package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInput() {
        assertAll(() -> assertEquals("The first name must be at least 2 characters long.\n" +
                        "The last name must be at least 2 characters long.\n" +
                        "The last name must be filled in.\n" +
                        "The employee ID must be in the format of AA-1234.\n" +
                        "The zipcode must be a 5 digit number.\n",App.validateInput("J", "", "ABCDE", "A12-1234")),
                ()-> assertEquals("There were no errors found.\n",App.validateInput("John", "Johnson", "55555", "TK-4321")));
    }
}