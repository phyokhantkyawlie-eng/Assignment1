package bankingsystem;

public class BankAccount {
	
	
	private String accountNumber;
	
	private double accbalance;
	
	private Customer customer;
	
	private AccountType accountType;

	public BankAccount(String accountNumber, double accbalance, Customer customer, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.accbalance = accbalance;
		this.customer = customer;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccbalance() {
		return accbalance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public AccountType getAccountType() {
		return accountType;
	}
	
	
	
	public void deposit(double amount) throws InvalidAmountException{
		
		if (amount <= 0 ) {
			throw new InvalidAmountException(accountNumber + " : Deposit amount is greater than zero.");
		}
		
		accbalance += amount;
		
		System.out.println("Deposit Successful.");
	}
	
	public void withdraw(double amount) throws InvalidAmountException{
		
		if (amount <=0 ) {
			throw new InvalidAmountException(accountNumber + " :Withdraw amount is greater than zero"); 
		}
		
		if (amount > accbalance) {
			
			throw new InvalidAmountException(accountNumber + " :Your balance is not enough");
			
			

		}
		
		accbalance -= amount;
		
		System.out.println("Withdraw Successful.");
		
		
	}
	
	public void showInfo() {
		
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Type: "+ accountType);
		System.out.println("Customer name: "+ customer.get_name());
		System.out.println("Phone :"+ customer.get_phone());
		
		System.out.println("City :"+customer.getAddress().get_city());
		
		
		System.out.println("Country :"+customer.getAddress().get_country());
		
		System.out.println("Balance :"+accbalance);
		
	}
	
	
	
	
	

}