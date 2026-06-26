package simple;

import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "Hello Java Course");
		
		
		String name = null;
		
		name = JOptionPane.showInputDialog(null, "What is your name",null);
		
		
		JOptionPane.showMessageDialog(null,"Your name is " + name);
		

	}

}