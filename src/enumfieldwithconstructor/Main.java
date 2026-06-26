package enumfieldwithconstructor;

public class Main {

	
	public static void main(String[] args) {
		 
		
		for(Car data  : Car.values()) {
			
			
			System.out.println(data + " price is "+ data.getPrice() + " and year is " + data.getYear()) ;
		}
	}
}