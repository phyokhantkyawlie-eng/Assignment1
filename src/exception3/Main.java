package exception3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	
	private void checkAge(int age) throws AgeException{
		
		if (age < 18) {
			throw new AgeException("Age must be 18 or above.");
		}else {
			System.out.println("You are allwed in the system.");
		}
		
	}
	
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Main m = new Main();
	 
		try {
			System.out.println("Enter Your Age");
			int age =Integer.parseInt(reader.readLine());
			
			m.checkAge(age);
			
			
		}catch(AgeException e) {
			System.out.println("Custom Exception: "+ e.getMessage());
		}
		
		
		
	}
	

}