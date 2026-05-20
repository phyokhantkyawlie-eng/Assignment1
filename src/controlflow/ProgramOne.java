package controlflow;

import javax.swing.JOptionPane;

public class ProgramOne {

    public static void main(String[] args) {

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Your Age.")
        );

        
        if (age >= 18) {

            JOptionPane.showMessageDialog(
                    null,
                    "You are allowed to drive."
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "You are too young to drive."
            );

        }

    }

}