package ex33;

import java.util.Scanner;

public class App {

    public static String eightBall(){
        String[] arr = {"Yes", "No", "Maybe", "Ask again later"};
        int random = (int) (Math.random() * 4) ;
        return arr[random];
    }
    public static void main(String args[]){
        System.out.print("What's your question?\n> ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.printf("\n%s", eightBall());

    }
}
