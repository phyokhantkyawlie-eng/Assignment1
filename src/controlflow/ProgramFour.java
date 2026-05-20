package controlflow;

import javax.swing.JOptionPane;

public class ProgramFour {

    public static void main(String[] args) {

        String[] games = new String[5];


        for (int i = 0; i < 5; i++) {

            games[i] = JOptionPane.showInputDialog(
                    "Enter Game Names"
            );

        }


        for (int i = 0; i < games.length; i++) {

            if (games[i].contains("Genshin")) {

                JOptionPane.showMessageDialog(
                        null,
                        "Found Genshin at index " + i
                );

            } else {

                System.out.println(games[i]);

            }

        }

    }

}