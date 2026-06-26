package stringmethod;

import java.util.Arrays;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		String moto = "I will learn, java and prepared, for the exam so I will get a, chance come out!";
		
		
		String[] arry = moto.split("," , 3);
		
		System.out.println(arry.length);
		
		System.out.println(Arrays.toString(arry));
		System.out.println(arry[0]);
		
		System.out.println(arry[1]);
		
		System.out.println(arry[2]);
		
		
		String username = "shein123";
		String password = "123123";
		
		System.out.println(password.length());// String length 
		
		username = password.trim(); // direct input value to one string to another string value.
		
		System.out.println(username);
		
		System.out.println(username.length());
		
		
		String nameOne ="Phyo Khant Kyaw";
		
		String nameTwo = "PhyoShein";
		
		// String if use
		
		if(nameOne.equals(nameTwo)) {
			System.out.println("Name are equal.");
			
		}
		
		// String check first letter
		
		if(nameOne.startsWith("Phyo")) {
			System.out.println("Ok");
		}
		
		
	}

}