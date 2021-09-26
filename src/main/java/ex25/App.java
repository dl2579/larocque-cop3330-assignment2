package ex25;

import java.util.HashMap;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App {
    static public int passwordValidator(String password){
        int i=0; //char count
        boolean eightChar = false, hasNum = false, hasLetter = false, hasSpecialChar = false;
        String specialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        for (char ch : password.toCharArray()){
            if(Character.isDigit(ch)){
                hasNum = true;
            }
            if(Character.isLetter(ch)){
                hasLetter = true;
            }
            if(specialChar.contains(Character.toString(ch))){
                hasSpecialChar = true;
            }
            i++;
        }

        if(i >= 8){
            eightChar = true;
        }

        if(hasNum && !hasLetter && !hasSpecialChar && !eightChar){
            return 1;
        }
        if(!hasNum && hasLetter && !hasSpecialChar && !eightChar){
            return 2;
        }
        if(hasNum && hasLetter && !hasSpecialChar && eightChar){
            return 3;
        }
        if(hasNum && hasLetter && hasSpecialChar && eightChar){
            return 4;
        }

        return 0;
    }


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "very weak");
        map.put(2, "weak");
        map.put(3, "strong");
        map.put(4, "very strong");

        String pw1 = "12345";
        String pw2 = "abcdef";
        String pw3 = "abc123xyz";
        String pw4 = "1337h@xor!";

        System.out.printf("The password \'%s\' is a %s password.%n" +
                          "The password \'%s\' is a %s password.%n" +
                          "The password \'%s\' is a %s password.%n" +
                          "The password \'%s\' is a %s password.%n",
                        pw1, map.get(passwordValidator(pw1)),
                        pw2, map.get(passwordValidator(pw2)),
                        pw3, map.get(passwordValidator(pw3)),
                        pw4, map.get(passwordValidator(pw4))  );

    }

}
