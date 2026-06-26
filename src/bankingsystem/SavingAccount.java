package bankingsystem;

public class SavingAccount extends BankAccount{

	
	private double interestRate;
	
	
	public SavingAccount(String accountNumber, double accbalance, 
			Customer customer, AccountType accountType, double interestRate) {
		
		
		super(accountNumber, accbalance, customer, accountType);
		
		this.interestRate = interestRate;
		
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("\n=======Saving Account Info=======");
		super.showInfo();
		System.out.println("Interest Rate: "+interestRate);
		
		
	}
	
	

}