package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(400.0, App.average(numbers));
    }

    @Test
    void max() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(1000, App.max(numbers));
    }

    @Test
    void min() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(100, App.min(numbers));
    }

    @Test
    void std() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        String std = String.format("%.2f", App.std(numbers));
        assertEquals("353.55", std);
    }
}