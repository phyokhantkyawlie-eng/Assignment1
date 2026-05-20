package controlflow;

import javax.swing.JOptionPane;

public class ProgramSeven {
    
    public static void main(String[] args) {
        
        String products[][] = new String[4][3];
        
        int row = 0;
        
        double totalPrice = 0;
        
        while (row < products.length) {
            
            int col = 0;
            
            while (col < products[row].length) {
                
                if (col == 0) {
                    products[row][col] = JOptionPane.showInputDialog("Enter Product " + (row + 1) + " Name");
                }
                
                if (col == 1) {
                    products[row][col] = JOptionPane.showInputDialog("Enter Product " + (row + 1) + " Brand");
                }
                
                if (col == 2) {
                    products[row][col] = JOptionPane.showInputDialog("Enter Product " + (row + 1) + " Price");
                    
                    totalPrice = totalPrice + Double.parseDouble(products[row][col]);
                }
                
                col++;
            }
            
            row++;
        }
        
        System.out.println("\n---- Product Data ----");
        
        row = 0;
        
        while (row < products.length) {
            
            int col = 0;
            
            while (col < products[row].length) {
                
                System.out.println(products[row][col] + "\t");
                
                col++;
            }
            
            System.out.println();
            
            row++;
        }
        
        System.out.println("Total Price: " + totalPrice);
        
    }

}