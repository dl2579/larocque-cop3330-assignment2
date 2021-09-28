package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        Integer[] filteredArr = {2,4,6,8};
        int[] inputArr = {1,2,3,4,5,6,7,8};
        Integer[] testArr = App.filterEvenNumbers(inputArr);

        assertArrayEquals(filteredArr, testArr );

    }
}