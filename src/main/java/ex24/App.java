package ex24;
import java.util.Scanner;
import java.util.Arrays;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) {
            return false;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args){
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        if(isAnagram(s1,s2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", s1, s2 );
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", s1, s2 );
        }
    }
}
