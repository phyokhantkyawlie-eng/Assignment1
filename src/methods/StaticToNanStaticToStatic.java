package methods;

public class StaticToNanStaticToStatic {
	
	
	
	
	/**
	 *   Static to Non Static -> No (Direct) | Class Object Create Use
	 *   Static to Static -> Yes (Direct) 
	 *   Non-Static to Static ->Yes 
	 * 
	 *  	
	 */
	public static void main(String[] args) { // static Method
		
		task();  
		
		
	}
	
	
	public static void task() { // static method
		
		StaticToNanStaticToStatic objOne = new StaticToNanStaticToStatic();
		objOne.heyNow();
		
	}
	
	
	
	public void heyNow() { // non static method
		theEnd();
		
	}
	
	
	public static void theEnd() { // static 
		System.out.println("End of Program.");
	}
	

}