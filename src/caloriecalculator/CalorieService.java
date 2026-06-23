package caloriecalculator;

public interface CalorieService {
	
	
	double calcuateBMR(UserData userData);
	
	
	double calculateDailyCalorieNeeds(double bmr, String activityLevel);
	
	

}