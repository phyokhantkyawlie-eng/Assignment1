package exception1;

public class UncheckedExceptionOne {
	
	
	
	private void arithmeticTest() {
		int x = 10;
		int y = 0;
		
		try {
			
			System.out.println("This is error step");
			System.out.println(x/y); // error occur  // Arithematic
			
			//  
		}catch(ArithmeticException e) {
			
			System.out.println("This is solutio step");
			System.out.println( x / (y+1)); // solution code
		}
		
		
	
	}
	
	
	public static void main(String[] args) {
		UncheckedExceptionOne ueo = new UncheckedExceptionOne();
		
		ueo.arithmeticTest();
	}

}