package caloriecalculator;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		
		
		UserInputHandler inputHandler = new UserInputHandler();
		
		CalorieService calorieService = new  CalorieServiceImpl();
		
		ResultDisplay resultDisplay = new ResultDisplay();
		
		
		UserData userData = inputHandler.gatherUserData();
		
		double bmr = calorieService.calcuateBMR(userData);
		
		 
		
		double calorieNeeds = calorieService.calculateDailyCalorieNeeds(bmr, userData.getActivityLevel());
		
		resultDisplay.displayResults(bmr, calorieNeeds);
		
		inputHandler.closeScanner();
	}

}