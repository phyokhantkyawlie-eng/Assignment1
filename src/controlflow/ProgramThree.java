package controlflow;

import javax.swing.JOptionPane;

public class ProgramThree {

    public static void main(String[] args) {

        
        String[] games = new String[5];


        for (int i = 0; i < 5; i++) {

            games[i] = JOptionPane.showInputDialog(
                    "Enter Your Favorite Game"
            );

        }

        
        for (int i = 0; i < games.length; i++) {

            System.out.println(games[i]);

        }

    }

}