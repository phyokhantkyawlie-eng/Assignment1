package controlflow;

public class ControlFlow_Five {

	public static void main(String[] args) {
		int age = 19;
		if (age < 13) {
			System.out.println("Child");
		}
		
		else if (age < 20) {
			System.out.println("Teenager");
		}
		
		else {
			System.out.println("Adult");
		}
		
		
		
		String username = "Phyo";
	    String password = "phyo123"; 
	    
		if(username.equals("Phyo") && password.equals("123")) {
			System.out.println("Login successful");
			}
		
		else if(username.equals("Phyo") || password.equals("123")) {
			System.out.println("invalid username or password");
			}
		
		else {
			System.out.println("Login failed");
		}
		
    
	}

}

