package bankingsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BankAccount[]  accounts = new BankAccount[2]; // Object Array 
		
		int i = 0;
		
		while(i < accounts.length) {
			System.out.println("\nCreate Account"+ (i + 1));
			
			System.out.println("Enter Customer Name: ");
			String name = reader.readLine();
			
			System.out.println("Enter Phone");
			String phone = reader.readLine();
			
			System.out.println("Enter City");
			String city = reader.readLine();
			
			System.out.println("Enter Country");
			String country = reader.readLine();
			
			
			System.out.println("Enter Acc No");
			String accNumber = reader.readLine();
			
			System.out.println("Enter Starting balance");
			double accbalance = Double.parseDouble(reader.readLine());
			
			
			System.out.println("Choose Account Type");
			System.out.println("1. Saving");
			System.out.println("2. Current");
			
			System.out.println("Enter Choice");
			
			int typeChoice  = Integer.parseInt(reader.readLine());
			
			AccountType acctype;
			
			if (typeChoice == 1 ) {
				acctype = AccountType.SAVING;
			}else {
				acctype = AccountType.CURRENT;
			}
			
			System.out.println("Enter Interest Rate");
			
			double inerestRate = Double.parseDouble(reader.readLine());
			
			Address address = new Address(city, country);
			
			Customer customer  = new Customer(name, phone, address);
			
			accounts[i] = new SavingAccount(accNumber, accbalance, customer, acctype, inerestRate);
			
			i++;
		
		}
		
		
		int choice = 0;
		
		
		do {
			System.out.println("\n==========Banking Menu=========");
			
			System.out.println("1. Show All Accounts");
			
			System.out.println("2. Deposit");
			
			System.out.println("3. Withdraw");
			
			System.out.println("4. Exit");
			
			System.out.println("Choose an options");
			
			
			choice = Integer.parseInt(reader.readLine());
			
			if(choice == 1) {
				for (BankAccount account : accounts) {
					account.showInfo();
				}
			}else if(choice == 2 ){
				System.out.println("Enter Account Number");
				
				String accNo = reader.readLine();
				
				boolean found = false;
				
				
				for (BankAccount account : accounts) {
					if(account.getAccountNumber().equals(accNo)) {
						
						
						
						try {
							System.out.println("Enter Deposit Amount");
							
							double amount = Double.parseDouble(reader.readLine());
							
							account.deposit(amount);
						}catch (InvalidAmountException e) {
								
							System.out.println(accNo + e.getMessage());
						}
						
						found = true;
						break;
					}
				}
				
				
				if (!found) {
					throw new AccountNotFoundException(accNo +  "Not found.");
				}
			}else if (choice == 3) {
				
				System.out.println("Enter Account Number");
				
				String accNo = reader.readLine();
				
				boolean found = false;
				
				for(BankAccount account : accounts) {
					
					
					if (account.getAccountNumber().equals(accNo)) {
						
						try {
							System.out.println("Enter Your Withdraw Amount:");
							
							double amount = Double.parseDouble(reader.readLine());
							
							account.withdraw(amount);
						}catch (InvalidAmountException e) {
							System.out.println(accNo + e.getMessage());
						}
						
						found = true;
						break;
						
					}
				}
				
				if(!found) {
					throw new AccountNotFoundException(accNo + "not found.");
			
				}
				
		}else if ( choice == 4 ) {
				System.out.println("Thanks you using the app.");
		}else {
				System.out.println("Invalid Choice.");
		}
	}while(choice != 4);
		
		
	}

}