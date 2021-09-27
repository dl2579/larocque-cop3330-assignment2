package ex27;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App {
    public static String validateInput(String fn, String ln, String zip, String id){
        String result = "";
        result += validateFirstName(fn);
        result += validateLastName(ln);
        result += validateEmployeeID(id);
        result += validateZipCode(zip);


        if(result.equals("")){
            return String.format("There were no errors found.%n");
        }
        else {
            return result;
        }

    }

    public static String validateFirstName(String fn){
        String result = "";

        if(fn.length()<2){
            result += String.format("The first name must be at least 2 characters long.%n");
        }

        if(fn.isEmpty()) {
            result += String.format("The first name must be filled in.%n");
        }

        return result;
    }

    public static String validateLastName(String ln){
        String result = "";
        if(ln.length()<2){
            result += String.format("The last name must be at least 2 characters long.%n");
        }

        if(ln.isEmpty()) {
            result += String.format("The last name must be filled in.%n");
        }
        return result;
    }

    public static String validateEmployeeID(String id){
        String result = "";
        char arr[] = id.toCharArray();

        if(!Character.isLetter(arr[0]) && !Character.isLetter(arr[1])){
            result = String.format("The employee ID must be in the format of AA-1234.%n");
        }

        if(arr[2] != '-'){
            result = String.format("The employee ID must be in the format of AA-1234.%n");
        }

        for(int i=3; i<7; i++){
            if(!Character.isDigit(arr[i])){
                result = String.format("The employee ID must be in the format of AA-1234.%n");
            }
        }
        return result;

    }

    public static String validateZipCode(String zip){
        String result = "";
        int i=0;
        for(char ch : zip.toCharArray()) {
            if (!Character.isDigit(ch)){
               result = String.format("The zipcode must be a 5 digit number.%n");
            }
            i++;
        }

        if(i != 5){
            result = String.format("The zip code must be a 5 digit number.%n");
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String fn = sc.nextLine();

        System.out.print("Enter the last name: ");
        String ln = sc.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip = sc.nextLine();

        System.out.print("Enter the employee ID: ");
        String id = sc.nextLine();

        System.out.printf("%s",validateInput(fn, ln, zip,id) );
    }
}
