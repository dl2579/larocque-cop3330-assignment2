package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static String pickWinner(ArrayList<String> contestants){
        int random = (int) (Math.random() * contestants.size()) ;
        return contestants.get(random);
    }

    public static void main(String args[]){
        ArrayList<String> contestants = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String input = "";

        do{
            System.out.print("Enter a name: ");
            input = sc.nextLine();
            contestants.add(input);
        } while(!input.equals(""));


        System.out.printf("The winner is...%s", pickWinner(contestants));
    }
}
