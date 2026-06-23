package enpcasulationprogram;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SavingAccount[] accounts = new SavingAccount[3];
		
		
		int i =0;
		
		while (i < accounts.length) {
			
			System.out.println("\n Create Account"+ (i + 1));
			
			System.out.print("Enter Customer Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter Customer Phone: ");
			String phone = sc.nextLine();
			
			
			Customer customer = new Customer(name, phone);
			
			System.out.print("Enter Account Number: ");
			String accountNumber = sc.nextLine();
			
			System.out.print("Enter Account Balance: ");
			double balance = Double.parseDouble(sc.nextLine());
			
			
			System.out.print("Enter Interest Rate: ");
			double interest = Double.parseDouble(sc.nextLine());
			
			accounts[i] = new SavingAccount(accountNumber, balance, customer, interest);
			
			i++;
			
		}
		
		int choice;
		
		do {
			
			
			System.out.println("\n-------Banking Menu------");
			
			System.out.println("1. Show All Accounts");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Choose Options");
			
			choice = Integer.parseInt(sc.nextLine());
			
			
			
			if (choice == 1 ) {
				for (SavingAccount account : accounts) {
					account.showAccountInfo();
				}
			}else if (choice == 2) {
				System.out.print("Enter Account Number: ");
				String accountNumber = sc.nextLine();
				
				boolean found = false;
				
				for (SavingAccount account : accounts) {
					if (account.getAccountNumber().equals(accountNumber)) {
						System.out.print("Enter Deposit Amount: ");
						double amount = Double.parseDouble(sc.nextLine());
						
						account.deposit(amount);
						found = true;
						break;
					}
				}
				
				if(!found) {
					System.out.println("Your Account Not Found.");
				}
			}else if(choice == 3) {
				
				System.out.print("Enter Account Number: ");
				String accountNumber = sc.nextLine();
				
				boolean found = false;
				
				for (SavingAccount account : accounts) {
					if (account.getAccountNumber().equals(accountNumber)) {
						System.out.print("Enter Withdraw Amount: ");
						double amount = Double.parseDouble(sc.nextLine());
						
						account.withdraw(amount);
						found = true;
						break;
					}
				}
				
				if(!found) {
					System.out.println("Your Account Not Found.");
				}
				
			}else if(choice == 4) {
				System.out.println("Thank You for using Banking App.");
			}else {
				System.out.println("Invalid Choice");
			}
			
			
			

		}while(choice !=4);
		
		sc.close();
		
		
	}

}