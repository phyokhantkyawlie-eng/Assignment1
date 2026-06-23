package enpcasulation1;

public class Son extends Dad{
	
	
	
	public static void main(String[] args) {
		
			Son son = new Son();
			
			son.phone = "Iphone 15 Pro Max";
			son.watch =  "G-shock"; 
			son.cloth = "H&M";
			
			son.getPhone();
			son.getWatch();
			son.getCloth();
	}

}