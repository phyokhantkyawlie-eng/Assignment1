package caloriecalculator;

public class CalorieServiceImpl implements CalorieService{
	
	
	//Constants Value
	
	private static final double MALE_BMR_CONSTANT = 88.362;
	private static final double FEMALE_BMR_CONSTANT = 447.593;
	private static final double MALE_WEIGHT_COEFFICENT = 13.397;
	private static final double FEMALE_WEIGHT_COEFFICENT = 9.247;
	private static final double MALE_HEIGHT_COEFFICENT = 4.799;
	private static final double FEMALE_HEIGHT_COEFFICENT = 3.098;
	private static final double MALE_AGE_COEFFICENT = 5.677;
	private static final double FEMALE_AGE_COEFFICENT = 4.330;
	
	
	
	private static final double SEDENTARY_MULTIPLIER = 1.2;
	private static final double MODERATE_MULTIPLIER = 1.55;
	private static final double ACTIVE_MULTIPLIER = 1.725;
	
	
	
	

	@Override
	public double calcuateBMR(UserData userData) {
		
		double bmr;
		
		if(userData.getGender().equals("M")) {
			// BMR Formula
			bmr = MALE_BMR_CONSTANT + (MALE_WEIGHT_COEFFICENT * userData.getWeight()) + (MALE_HEIGHT_COEFFICENT * userData.getHeight()) 
					-  (MALE_AGE_COEFFICENT * userData.getAge());
		}else {
			bmr = FEMALE_BMR_CONSTANT + 
					(FEMALE_WEIGHT_COEFFICENT * userData.getWeight())+
					(FEMALE_HEIGHT_COEFFICENT * userData.getHeight())-
					(FEMALE_AGE_COEFFICENT * userData.getAge());
		}
		
		
		
		return bmr;
	}

	
	
	@Override
	public double calculateDailyCalorieNeeds(double bmr, String activityLevel) {
	
		
		double calorieNeed = 0;
		
		
		// why lower -> user Cap -> lower
		switch (activityLevel.toLowerCase()) {
			
		case "sedentary":
			calorieNeed = bmr * SEDENTARY_MULTIPLIER;
			break;
		case "moderate":
			calorieNeed = bmr * MODERATE_MULTIPLIER;
			break;
			
		case "active":
			calorieNeed = bmr * ACTIVE_MULTIPLIER;
			break;
			
		default : 
			System.out.println("Invalid Error");
		
	
		}
		
		return calorieNeed;
	}

}