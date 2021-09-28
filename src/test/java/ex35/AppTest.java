package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void pickWinner() {
        ArrayList<String> contestants = new ArrayList<String>();
        contestants.add("PersonA");
        contestants.add("PersonB");
        contestants.add("PersonC");

        boolean Awinner = false;
        boolean Bwinner = false;
        boolean Cwinner = false;

        for(int i=0; i<30; i++) {
            String winner = App.pickWinner(contestants);

            if (winner.equals("PersonA")) {
                Awinner = true;
            }
            else if(winner.equals("PersonB")) {
                Bwinner = true;
            }else if(winner.equals("PersonC")) {
                Cwinner = true;
            }

            assertEquals(true, winner == "PersonA" || winner == "PersonB" || winner == "PersonC");
        }

        assertEquals(true, (Awinner && Bwinner && Cwinner));
    }
}