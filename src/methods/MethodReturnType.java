package methods;


/*
 * 
 *    void / return keyword 
 *    
 *    1. work
 *    2. return value give / dont give 
 *    
 *    
 * 
 */
public class MethodReturnType {
	
	
	
	public static void main(String[] args) {
		
//		System.out.println(task());
//		
//		
//		System.err.println(name());
		
		 
		MethodReturnType obj = new MethodReturnType();
		
		if (obj.isTrue()) {  
			System.out.println("It is true.");
		}else {
			
			System.err.println("It is false.");
		}
		
		todo();
		
		
		obj.callingName("Phyo Khant Kyaw");
		
		
		
		 
	}
	
	
	public static int task() {
		return 10;
	}
	
	
	public static String name() {
		
		
		return "We are learning java standard edition";
	}
	
	

	public boolean isTrue() { // non static 
		
		return false;
	}
	
	
	public static void todo() {
		System.out.println("This is void method no return."); // no return keyword
	}
	
	public void callingName(String name) {
		System.out.println("Hello this is "+ name); // no return keyword
	}
	
	
	
	

}