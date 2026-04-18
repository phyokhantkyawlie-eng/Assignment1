package array;

import java.util.Arrays;

public class SingleArray {

    public static void main(String[] args) {

        String[] friends = new String[5];

        friends[0] = "Alex";
        friends[1] = "Brian";
        friends[2] = "Cathy";
        friends[3] = "Derek";
        friends[4] = "Elena";

        System.out.println(friends[2]);

        System.out.println(Arrays.toString(friends));

        String[] cityNames = new String[] {"Tokyo", "Bangkok", "Seoul"};

        String[] gamePlayers = {"Shadow", "Hunter", "Blaze", "Falcon"};

        System.out.println("Game Players Length: " + gamePlayers.length);
    }
}