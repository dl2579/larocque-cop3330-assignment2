package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String args[]){
        ArrayList<String> contestants = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String input = "";

        do{
            System.out.print("Enter a name: ");
            input = sc.nextLine();
            contestants.add(input);
        } while(!input.equals(""));

        int random = (int) (Math.random() * contestants.size()) ;
        System.out.printf("The winner is...%s", contestants.get(random));
    }
}
