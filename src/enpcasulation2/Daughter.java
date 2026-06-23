package enpcasulation2;

import enpcasulation1.Dad;

public class Daughter extends Dad{
	
	public static void main(String[] args) {
		
		
		Daughter daughter =new Daughter();
		
		// daughter.wallet private vairable
		
		// daughter.phone default access level variable other package can't cannot call
		
		daughter.watch ="AP WATCH";
		daughter.cloth = "Mango";
		
		daughter.getWatch();
		daughter.getCloth();
	}

}