package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList<String> removeEmployee(ArrayList<String> arrList, String employee){
        arrList.remove(employee);
        return arrList;
    }

    public static void printEmployess(ArrayList<String> empList){
        System.out.printf("There are %d employees: \n", empList.size());
        for(String i : empList){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        printEmployess(employeeList);

        System.out.print("\nEnter an employee name to remove: ");
        String emp = sc.nextLine();

        removeEmployee( employeeList,emp);

        printEmployess(employeeList);

    }
}
