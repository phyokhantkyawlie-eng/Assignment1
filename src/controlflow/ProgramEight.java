package controlflow;

import java.util.Scanner;

public class ProgramEight {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[][] players = new String[2][4];
        
        System.out.println("Enter Player Age");
        int age = Integer.parseInt(sc.nextLine());
        
        if (age >= 18) {
            
            int row = 0;
            
            while (row < players.length) {
                
                int col = 0;
                
                System.out.println("\nEnter Data For Player " + (row + 1));
                
                while (col < players[row].length) {
                    
                    if (col == 0) {
                        System.out.println("Enter Player Name");
                        players[row][col] = sc.nextLine();
                    }
                    
                    if (col == 1) {
                        System.out.println("Enter Match 1 Score");
                        players[row][col] = sc.nextLine();
                    }
                    
                    if (col == 2) {
                        System.out.println("Enter Match 2 Score");
                        players[row][col] = sc.nextLine();
                    }
                    
                    if (col == 3) {
                        System.out.println("Enter Match 3 Score");
                        players[row][col] = sc.nextLine();
                    }
                    
                    col++;
                }
                
                row++;
            }
            
            System.out.println("\n----- Player Score Result -----");
            
            row = 0;
            
            while (row < players.length) {
                
                double total = 0;
                
                total += Double.parseDouble(players[row][1]);
                total += Double.parseDouble(players[row][2]);
                total += Double.parseDouble(players[row][3]);
                
                System.out.println("\nPlayer " + (row + 1));
                System.out.println("Name: " + players[row][0]);
                System.out.println("Match One: " + players[row][1]);
                System.out.println("Match Two: " + players[row][2]);
                System.out.println("Match Three: " + players[row][3]);
                System.out.println("Total Score: " + total);
                
                if (total >= 120) {
                    System.out.println("Result: Qualified");
                } else {
                    System.out.println("Result: Not Qualified");
                }
                
                row++;
            }
            
        } else {
            
            System.out.println("Age must be 18 or above");
        }
        
        sc.close();
        
    }

}