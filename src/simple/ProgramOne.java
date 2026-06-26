package simple;

import javax.swing.JOptionPane;

public class ProgramOne {

	public static void main(String[] args) {
	
		
		String username;
		
		String email;
		
		String mobile;
		
		int age; 
		
		JOptionPane.showMessageDialog(null,"Please fill the user information");
		
		username = JOptionPane.showInputDialog("Enter Username");
		
		email = JOptionPane.showInputDialog("Enter Email Address");
		
		mobile = JOptionPane.showInputDialog("Enter Mobile Number", "09");
		
		
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
		
		
		System.out.println("Input Result");
		System.out.println("xxxxxxxxxxxx");
		System.out.println(username);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(age);
		
		
		
		
		

	}

}