package controlflow;

import javax.swing.JOptionPane;

public class ProgramTwo {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(
                null,
                "Welcome to Laptop Performance Checking Area."
        );

        
        String laptopName = JOptionPane.showInputDialog(
                "Enter Your Laptop Name"
        );

        String laptopBrand = JOptionPane.showInputDialog(
                "Enter Your Laptop Brand"
        );

        
        double ram = Double.parseDouble(
                JOptionPane.showInputDialog("Enter RAM Size (GB)")
        );

        
        if (ram <= 4) {
            
            JOptionPane.showMessageDialog(
                    null,
                    "Your " + laptopBrand + " " + laptopName +
                    " has Low Performance."
            );

        } else if (ram >= 5 && ram <= 8) {
            
            JOptionPane.showMessageDialog(
                    null,
                    "Your " + laptopBrand + " " + laptopName +
                    " has Medium Performance."
            );

        } else if (ram >= 9 && ram <= 16) {
            
            JOptionPane.showMessageDialog(
                    null,
                    "Your " + laptopBrand + " " + laptopName +
                    " has Great Performance."
            );

        } else {
            
            JOptionPane.showMessageDialog(
                    null,
                    "Your " + laptopBrand + " " + laptopName +
                    " has Excellent Performance."
            );

        }

    }

}