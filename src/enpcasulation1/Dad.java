package enpcasulation1;

public class Dad {
	
	private String wallet; 
	
	String phone; 
	
	protected String watch; 
	
	public String cloth; 
	
	
	private void getWallet() {
		System.out.println("Wallet is "+wallet);
	}
	
	void getPhone() {
		System.out.println("Phone is "+phone);
		
	}
	
	protected void getWatch() {
		System.out.println("Watch is "+watch);
		
	}
	
	public void getCloth() {
		
		System.out.println("Cloth is "+cloth);
	}
	
	
	public static void main(String[] args) {
		Dad dad = new Dad();
		
		dad.wallet = "$1000";
		dad.phone = "Iphone 17 Pro Max";
		dad.watch = "Rolex";
		dad.cloth ="Uniqulo";
		
		
		dad.getWallet();
		dad.getPhone();
		dad.getWatch();
		dad.getCloth();
		
		
	}
	
	
	

}