package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void removeEmployee() {
        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        assertEquals(true, employeeList.contains("Jackie Jackson"));

        employeeList = App.removeEmployee(employeeList,"Jackie Jackson");

        assertEquals(false, employeeList.contains("Jackie Jackson"));
    }
}