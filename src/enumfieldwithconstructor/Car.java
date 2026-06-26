package enumfieldwithconstructor;

public enum Car {
	
	// constants values
	
	swift (200 , 2016),
	landcruiser (1200 , 2013),
	toyota (500, 2015),
	marcedee (800 , 2017);
	
	public final int price;

	public final int year;
	
	
	// enum constructor 
	
	Car (int cost , int made){
		price = cost;
		year = made;
	}


	public int getPrice() {
		return price;
	}


	public int getYear() {
		return year;
	}
	
	
	
}