package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static boolean inputValidation(String s){
        //verify that input is convertible to int
        try {
            Integer.parseInt(s); //attempt converting str to int
        } catch (NumberFormatException e ) {
            return false;
        }
        return true;
    }

    public static float average(ArrayList<Integer> nums){
        float avg = 0f;
        for(int i : nums){
            avg += i;
        }
        avg /= nums.size();
        return avg;
    }

    public static int max(ArrayList<Integer> nums){
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> nums){
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public static float std(ArrayList<Integer> nums){
        float std = 0f;
        float avg = average(nums);
        int sumSqDiff = 0; //square of the difference between each data point and the sample mean

        for(int i : nums){
            sumSqDiff += Math.pow((i - avg), 2);
        }

        std = (float) Math.sqrt(sumSqDiff / nums.size());
        return std;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String input = "";

        while (true) {
            System.out.print("Enter a number: ");
            input = sc.nextLine();

            if (input.equals("done")) {
                break;
            }

            if (!inputValidation(input)) {
                System.out.println("Invalid input.");
                continue;
            }

            int num = Integer.parseInt(input);
            numbers.add(num);
        }

        System.out.print("Numbers: ");
        for(int i : numbers){
            System.out.printf("%d ", i);
        }

        System.out.printf("\nThe average is %.1f", average(numbers));
        System.out.printf("\nThe minimum is %d", min(numbers));
        System.out.printf("\nThe maximum is %d", max(numbers));
        System.out.printf("\nThe standard deviation is %.2f", std(numbers));
    }
}
