package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Integer[] filterEvenNumbers(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                newArr.add(arr[i]);
            }
        }
        return newArr.toArray(new Integer[0]);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");

        int[] arr = new int[8];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] array = filterEvenNumbers(arr);
        System.out.print("The even numbers are ");

        for(Integer j : array){
            System.out.printf("%d ", j);
        }

    }
}
