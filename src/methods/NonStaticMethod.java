package methods;

public class NonStaticMethod {
	
	
	public static void main(String[] args) {  // static method
		
		
		NonStaticMethod non = new NonStaticMethod(); // creating obj for this class.
		non.task();
			
		teaching();
		
		
		
		
	}
	
	
	public void task() { // non-static method.
		
		System.out.println("Hello I am non static method.");
	}
	
	public static void teaching() { // static method
		System.out.println("I am Static Method");
	}
	
	
	
	/**
	 * 
	 *  		Non Static 						Static
	 * 1. 		 Depend on the object			independent on the object.
	 * 2. 		 no static keyword 				contain static keyword.
	 * 3. 		 								first to do
	 */

}