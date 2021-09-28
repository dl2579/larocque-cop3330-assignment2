package ex39;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static class Employee {
        // Instance Variables
        String firstName;
        String lastName;
        String position;
        String sepDate;

        // Constructor Declaration of Class
        public Employee(String firstName, String lastName,
                        String position, String sepDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
            this.sepDate = sepDate;
        }

        // method 1
        public String getFirstName() {
            return firstName;
        }

        // method 2
        public String getLastName() {
            return lastName;
        }

        // method 3
        public String getPosition() {
            return position;
        }

        // method 4
        public String getSepDate() {
            return sepDate;
        }

    }

    public static String sortingRecord(TreeMap<String, Employee> tmap) {
        String output = "";

        output += "Results:\n ";
        output += "\nName                | Position          | Separation Date\n";
        output += "--------------------|-------------------|----------------\n";
        String name = "";

        for (Map.Entry<String, Employee> e : tmap.entrySet()) {
            name = e.getValue().firstName + " " + e.getValue().lastName;
            output += String.format("%-19.20s | %-17.10s | %s\n", name, e.getValue().position, e.getValue().sepDate);
        }

        return output;
    }


    public static void main(String args[])
    {
        Employee emp1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee emp2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee emp3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee emp4 = new Employee("Jake", "Jacobson", "Programmer", " ");
        Employee emp5 = new Employee("Jacquelyn", "Jackson", "DBA", " ");
        Employee emp6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        TreeMap<String, Employee> tmap = new TreeMap<String, Employee>();

        tmap.put(emp1.lastName, emp1);
        tmap.put(emp2.lastName, emp2);
        tmap.put(emp3.lastName, emp3);
        tmap.put(emp4.lastName, emp4);
        tmap.put(emp5.lastName, emp5);
        tmap.put(emp6.lastName, emp6);

        System.out.println(sortingRecord(tmap));

        /*
        System.out.println("\nName                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        String name ="";
        for (Map.Entry<String, Employee> e : tmap.entrySet()) {
            name = e.getValue().firstName + " " + e.getValue().lastName;
            System.out.printf("%-19.20s | %-17.10s | %s\n", name, e.getValue().position, e.getValue().sepDate);
        }*/

    }
}
