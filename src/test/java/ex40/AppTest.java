package ex40;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filteringRecord() {
        App.Employee emp1 = new App.Employee("John", "Johnson", "Manager", "2016-12-31");
        App.Employee emp2 = new App.Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        App.Employee emp3 = new App.Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        App.Employee emp4 = new App.Employee("Jake", "Jacobson", "Programmer", " ");
        App.Employee emp5 = new App.Employee("Jacquelyn", "Jackson", "DBA", " ");
        App.Employee emp6 = new App.Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        TreeMap<String, App.Employee> tmap = new TreeMap<String, App.Employee>();

        tmap.put(emp1.lastName, emp1);
        tmap.put(emp2.lastName, emp2);
        tmap.put(emp3.lastName, emp3);
        tmap.put(emp4.lastName, emp4);
        tmap.put(emp5.lastName, emp5);
        tmap.put(emp6.lastName, emp6);

        assertEquals("Results: \n" +
                        "\n" +
                        "Name                | Position          | Separation Date\n" +
                        "--------------------|-------------------|----------------\n" +
                        "Jacquelyn Jackson   | DBA               |  \n" +
                        "Jake Jacobson       | Programmer        |  "
                ,App.filteringRecord(tmap,"Jac"));
    }
}