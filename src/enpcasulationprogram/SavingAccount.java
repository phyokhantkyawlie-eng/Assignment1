package enpcasulationprogram;

public class SavingAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingAccount(String accountNumber, double balance, Customer customer,double interestRate) {
		super(accountNumber, balance, customer);
		this.interestRate = interestRate;
	
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public void showAccountInfo() {
		
		super.showAccountInfo();
		System.out.println("Interest Rate:"+interestRate+" %");
		System.out.println("---------------------------------");
		
	}

	
	
	

}