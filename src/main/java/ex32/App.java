package ex32;

import java.util.Scanner;

public class App {

    public static int randomGen(int dif){
        int random=0;
        //Math.random() returns a double between 0 and 1
        if(dif == 1){
            random = (int) (Math.random() * 10) + 1;
        }
        else if(dif == 2){
            random = (int) (Math.random() * 100) + 1;
        }
        else {
            random = (int) (Math.random() * 1000) + 1;
        }
        return random;
    }

    public static boolean inputValidation(String s){
        //verify that input is convertible to int
        try {
            Integer.parseInt(s); //attempt converting str to int
        } catch (NumberFormatException e ) {
            return false;
        }
        return true;
    }

    public static String guessNum(int num){
        int guess=0;
        int i=0;
        String input = "";
        System.out.print("I have my number. What's your guess? ");

        do{
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            i++;

            if (!inputValidation(input)){
                System.out.println("Invalid input. Guess again: ");
                continue;
            }

            guess = Integer.parseInt(input);

            if(guess < num){
                System.out.print("Too low. Guess again: ");
            }
            else if (guess > num){
                System.out.print("Too high. Guess again: ");
            }

        } while(guess != num);

        return String.format("You got it in %d guesses", i);
    }

    public static void main(String args[]){
        System.out.println("Let's play Guess the Number!");
        String input = ""; //difficulty
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            input = sc.nextLine();
        } while(!inputValidation(input));

        int dif = Integer.parseInt(input);
        int num = randomGen(dif);

        System.out.println(guessNum(num));

        String playAgain = "";
        do{
            System.out.print("Do you wish to play again? (Y/N)? ");
            playAgain = sc.nextLine();
            if (playAgain.equals("Y")){
                do{
                    System.out.print("Enter the difficulty level (1, 2, or 3): ");
                    input = sc.nextLine();
                } while(!inputValidation(input));

                dif = Integer.parseInt(input);
                num = randomGen(dif);

                System.out.println(guessNum(num));
            }
        } while(playAgain.equals("Y"));
    }
}
