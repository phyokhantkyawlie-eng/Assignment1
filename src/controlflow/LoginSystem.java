package controlflow;

import javax.swing.JOptionPane;

public class LoginSystem {

	public static void main(String[] args) {
		
		
		String[][] users = {
				
				{		
					"admin@rsu.ac.th","admin123"
				},
				{
					"phyokhantkyaw@rsu.ac.th","phyo123"
				}, 
				{
					"shein@rsu.ac.th" ,"shein123"
				}
		};
		
		
		boolean loginSuccess = false;
		
		do {
			
			JOptionPane.showMessageDialog(null,"Please Login Here");
			
			String username = JOptionPane.showInputDialog("Enter Username:");
			
			String password = JOptionPane.showInputDialog("Enter Password: ");
			
			
			int row = 0;
			
			while (row < users.length) {
				
				
				if (username.equals(users[row][0]) && password.equals(users[row][1])) {
					
					loginSuccess = true;
					
					break;
				}
				
				else if (username.equals(users[row][0])) {

					JOptionPane.showMessageDialog(null, "Password is wrong");

					break;
				}
				
				else if (password.equals(users[row][1])) {

					JOptionPane.showMessageDialog(null, "Username is wrong");

					break;
				}
				
				row++;
			}
			
			if (loginSuccess) {
				JOptionPane.showMessageDialog(null, "Login Successful");
			}else {
				JOptionPane.showMessageDialog(null, "Username & Password is wrong. Try Again");
			}
				
		}while(!loginSuccess);// when true it will stop. 
	

	}

}