package caloriecalculator;

public class UserData {
	
	
	private String gender;
	private int age;
	private double weight;
	private double height;
	private String activityLevel;
	
	
	public UserData(String gender, int age, double weight, double height, String activityLevel) {
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.activityLevel = activityLevel;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public String getActivityLevel() {
		return activityLevel;
	}


	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}
	
	
	
	
	

}