package overloading;

public class CalculatorParent {
	
	public void add(int i) { // same name method different parameter
		
		System.out.println(i+i);
	}
	
	
	public void add(double i) {
		System.out.println(i+i);
		
	}
	
	
	public void add (int x , int y) {
		
		System.out.println(x + y);
	}
	
	
	public static void main(String[] args) {
		
		
		CalculatorParent c = new CalculatorParent();
		
		c.add(1); // int i
		c.add(4.666); // double i 
		c.add(10,20); // int x , int y 
		
		
		
	}
	
	

}