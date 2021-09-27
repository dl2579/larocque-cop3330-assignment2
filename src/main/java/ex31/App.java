package ex31;

import java.util.Scanner;

public class App {
    public static String targetHeartRate(int age, int hr){
        String output = "";
        output += String.format("\nIntensity    | Rate   \n-------------|--------\n");
        for(float i=55f; i <= 95f; i+=5){
            output+= String.format("%.0f%%          | %d bpm\n", i, karvonenHR(age, hr, i/100));
        }
        return output;
    }

    public static int karvonenHR(int age, int hr, float intensity){
        int target = (int) (((220 - age) - hr) * intensity) + hr;
        return target;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your resting heart rate: ");
        int restHR = sc.nextInt();
        sc.nextLine();

        System.out.printf("Resting Pulse: %d        Age: %d\n", restHR, age);
        System.out.print(targetHeartRate(age, restHR));

    }
}
