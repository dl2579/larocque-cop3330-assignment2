package ex29;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App {
    public static int inputToInt(String s){
        int in = 0;
        try {
            in = Integer.parseInt(s);

            if(in==0){
                System.out.println("Sorry. That's not a valid input.");
                return 0;
            }

        } catch (NumberFormatException e ) {
            System.out.println("Sorry. That's not a valid input.");
            return 0;
        }
        return in;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String r ="";

        do {
            System.out.print("What is the rate of return? ");
            r = sc.nextLine();
        } while (inputToInt(r) == 0);

        System.out.printf("It will take %d years to double your initial investment.%n", 72 / inputToInt(r));

    }
}
