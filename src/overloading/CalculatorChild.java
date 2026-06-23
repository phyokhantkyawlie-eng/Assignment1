package overloading;

public class CalculatorChild extends CalculatorParent{
	
	public void add(int x , int y , int z) { // Inheritance Overload method 
		
		System.out.println(x + y + z);
		
	}
	
	public static void main(String[] args) {
		
		CalculatorChild cc = new CalculatorChild();
		
		cc.add(5, 10, 20); // from inheritance overloading method 
		cc.add(1); // from parent Class Method 
		cc.add(4.888); // double  from parent Class Method 
		cc.add(6, 6); // int x , int y from parent Class Method
		
		
	}

}