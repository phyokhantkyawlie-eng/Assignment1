package enpcasulationprogram;

public class BankAccount {
	
	
	private String accountNumber;
	
	private double balance;
	
	private Customer customer;

	public BankAccount(String accountNumber, double balance, Customer customer) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}



	public Customer getCustomer() {
		return customer;
	}
	
	public void deposit(double amount) {
		
		if (amount > 0) {
			balance += amount;
			
			System.out.println("Deposit Successful.");
		}else {
			System.out.println("Invalid Amount");
		}
	}

	
	public void withdraw(double amount) {
		
		if (amount >0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successful.");
			
		}else {
			System.out.println("Not Enough Balance or invalid amount.");
		}
	}
	
	public void showAccountInfo() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Customer Name:"+customer.getName());
		System.out.println("Phone: "+customer.getPhone());
		System.out.println("Balance: "+balance);
		
	}

	
	
	
	
	
	

}