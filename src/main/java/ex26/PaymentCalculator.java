package ex26;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(float i, float b, float p){
        i /= 365;
        i /= 100;
        double n =  -(1/30f) * Math.log(1 + b/p * (1 - Math.pow((1+i),30)) )  / Math.log(1+i);
        int numMonths = (int) Math.ceil(n);
        return numMonths;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        float b = sc.nextFloat();
        b = (float) Math.round(b*100)/100;
        sc.nextLine();

        System.out.print("What is the APR on the card (as a percent)? ");
        float i = sc.nextFloat();
        sc.nextLine();

        System.out.print("What is the monthly payment you can make? ");
        float p = sc.nextFloat();
        sc.nextLine();

        System.out.printf("It will take you %d months to pay off this card.%n", calculateMonthsUntilPaidOff(i,b,p));


    }
}


