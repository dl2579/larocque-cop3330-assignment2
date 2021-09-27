package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        System.out.printf("There are %d employees: \n", employeeList.size());
        for(String i : employeeList){
            System.out.println(i);
        }

        System.out.print("\nEnter an employee name to remove: ");
        String emp = sc.nextLine();
        employeeList.remove(emp);
        System.out.printf("\nThere are %d employees: \n", employeeList.size());
        for(String i : employeeList){
            System.out.println(i);
        }



    }
}
