package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordGen() {
        String password = App.passwordGen(8, 2, 2);
        assertEquals(true, (password.length() >= 8));

        char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
        char[] specialChar = {'!','@','#','$','%','^','&','*','(',')'};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        int numsCount = 0;
        int specialCount = 0;
        int letterCount = 0;

        char[] passArr = password.toCharArray();

        for(int i=0; i<passArr.length; i++) {
            char toCheckValue = passArr[i];

            for (char ch : nums) {
                if (ch == toCheckValue) {
                    numsCount++;
                }
            }

            for (char ch : specialChar) {
                if (ch == toCheckValue) {
                    specialCount++;
                }
            }

            for (char ch : letters) {
                if (ch == toCheckValue) {
                    letterCount++;
                }
            }
        }

        assertEquals(4, letterCount);
        assertEquals(2, numsCount);
        assertEquals(2, specialCount);


    }
}