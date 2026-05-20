package controlflow;

import java.util.Scanner;

public class ProgramSix {

    public static void main(String[] args) {

        String[][] games = new String[5][2];

        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i < games.length) {

            System.out.print(
                    "Enter game name for game " + (i + 1) + ": "
            );

            games[i][0] = sc.nextLine();

            
            System.out.print(
                    "Enter game genre for game " + (i + 1) + ": "
            );

            games[i][1] = sc.nextLine();

            i++;

        }

        
        System.out.println("\n---- Game List ----");

        
        int j = 0;

        while (j < games.length) {

            System.out.println(
                    games[j][0] + " - " + games[j][1]
            );

            j++;

        }

        sc.close();

    }

}