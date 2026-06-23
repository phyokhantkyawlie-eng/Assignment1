package caloriecalculator;

import java.util.Scanner;

public class UserInputHandler {
	
	private Scanner scanner; // composition 
	
	public UserInputHandler() {
		this.scanner = new Scanner(System.in);
		
	}
	
	public UserData gatherUserData() {
		
		
		System.out.println("Calorie Calculator");
		
		String gender = getValidGenderInput();
		
		int age = getValideIntInput("Enter Your Age: ");
		
		double weight = getValidDoubleInput("Enter Weight (in kilograms) : ");
		
		double height = getValidDoubleInput("Enter height (in Centimeters) : ");
		
		String activityLevel = getValidActivityLevel();
		
		return new UserData(gender, age, weight, height, activityLevel);
				
		
		
	}
	
	
	public String getValidGenderInput() {
		
		
		String gender = null;
		
		while(true) {
			System.out.println("Enter Gender (M / F ) :");
			gender = scanner.nextLine().trim().toUpperCase(); // Auto Capital Letter
			
			if(gender.equals("M") || gender.equals("F")) {
				break;
			}
			
			System.out.println("Invalid Gender Please input M / F");
			
		
		}
		return gender;
	}
	
	
	private int getValideIntInput(String prompt ) {
		int value;
		
		while(true) {
			System.out.println(prompt);
			
			if (scanner.hasNextInt()) {
				value = scanner.nextInt();
				
				scanner.nextLine();
				if(value > 0) {
					break;
				}else {
					System.out.println("Invalid Value please enter a positive integer");
				}
			}else {
				System.out.println("Invalid Value Please enter integer;");
				scanner.nextLine();
			}
			
		}
		return value;
	}
	
	private double getValidDoubleInput(String prompt) {
		
		double value =0;
		
		while(true) {
			System.out.println(prompt);
			
			if(scanner.hasNextDouble()) {
				value = scanner.nextDouble();
				scanner.nextLine();
				
				if(value > 0) {
					break;
				}else {
					System.out.println("Invalid Value please enter a positive double");
				}
				
			}else {
				System.out.println("Invalid value Please Enter valid Number");
				scanner.nextLine();
			}
		}
		return value;
	
		
		
	}
	
	private String getValidActivityLevel() {
		String activityLevel;
		
		while(true) {
			System.out.println("Enter Your Activity Level ( sedentary / moderate / active) : ");
			activityLevel = scanner.nextLine().trim().toLowerCase();
			
			if(activityLevel.equals("sedentary")  || activityLevel.equals("moderate")  ||  activityLevel.equals("active") ) {
				break;
			}
			
			System.out.println("Invalid Activity Level.");
		}
		
		return activityLevel;
	}
	
	
	public void closeScanner() {
		scanner.close();
	}
	
	
	

}