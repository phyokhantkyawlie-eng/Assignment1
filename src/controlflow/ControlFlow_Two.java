package controlflow;

import javax.swing.JOptionPane;

public class ControlFlow_Two {

	public static void main(String[] args) {
	
		
		String input = JOptionPane.showInputDialog("Enter Tea - 1 & Coffee - 2");
		
		int drinkChoice = Integer.parseInt(input);
		
		
		switch (drinkChoice) {
		case 1:
			JOptionPane.showMessageDialog(null, "You selected Tea !!");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "You selected Coffee !!");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Invalid Drink Choice");
			break;
		}

	}

}