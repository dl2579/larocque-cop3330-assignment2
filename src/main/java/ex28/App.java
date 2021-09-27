package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */

import java.util.Scanner;

public class App {
    public static int addingNums(int num1, int num2, int num3, int num4, int num5){
        return num1 + num2 + num3 + num4 + num5;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.printf("The total is %d.%n", addingNums(arr[0], arr[1], arr[2], arr[3], arr[4]));
    }
}
