package enpcasulation2;

import enpcasulation1.Dad;

public class StrangerTwo {
	
	public static void main(String[] args) {
		
		Dad dad = new Dad();
		
		// dad.wallet private access level from Dad.class
		
		// dad.phone default access level from Dad.class
		
		// dad.watch protected access level from Dad.class
		
		dad.cloth ="Polo";
		
		dad.getCloth(); 
		
		
	}

}