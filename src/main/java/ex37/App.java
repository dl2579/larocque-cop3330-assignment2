package ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static String passwordGen(int len, int numSpecialChar, int numOfNums){
        String password = "";

        char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
        char[] specialChar = {'!','@','#','$','%','^','&','*','(',')'};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        char[][] arrays = {nums, specialChar, letters};

        int random, i;

        for(i=0; i<numSpecialChar; i++){
            random = (int) (Math.random() * specialChar.length);
            password += specialChar[random];
        }

        for(i=0; i<numOfNums; i++){
            random = (int) (Math.random() * specialChar.length);
            password += nums[random];
        }

        for(i=0; i< len - numSpecialChar - numOfNums; i++){
            random = (int) (Math.random() * specialChar.length);
            password += letters[random];
        }

        //Convert string to a Character array list so that we can use shuffle function to randomize order
        List<Character> solution = new ArrayList<>();
        for (i = 0; i < password.length(); i++) {
            solution.add( password.charAt(i) );
        }
        Collections.shuffle(solution);

        StringBuilder sb = new StringBuilder();

        // Appends characters one by one
        for (Character ch : solution) {
            sb.append(ch);
        }

        password = sb.toString();
        return password;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLen = sc.nextInt();
        sc.nextLine();

        System.out.print("How many special characters? ");
        int specialCharNum = sc.nextInt();
        sc.nextLine();

        System.out.print("How many numbers? ");
        int numOfNum = sc.nextInt();
        sc.nextLine();

        System.out.printf("Your password is %s", passwordGen(minLen, specialCharNum, numOfNum));
    }
}
