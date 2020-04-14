package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Account;

public class AccountMainV2 {

	public static void main(String[] args) {
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		String continueChoice;
		
		System.out.println("Welcome To AXIS Bank");
		System.out.println();
		
		System.out.println("Enter the Account Number : ");
		long accountNumber = scanner.nextLong();
		
		System.out.println("Enter your Name : ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("Enter your balance : ");
		double balance = scanner.nextDouble();
		
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
		
		System.out.println("Thanks for the details");
		System.out.println("Print all the details : ");
		
		
		System.out.println("Account Number : "+ account.getAccountNumber());
		System.out.println("Name : "+ account.getName());
		System.out.println("Balance : "+ account.getBalance());
		
		do {
			System.out.println("**********MENU***********");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Balance");
			
			
			System.out.println("Enter your choice (1 or 2 or 3) : ");
			int transactionChoice = scanner.nextInt();
			
			switch (transactionChoice) {
			case 1:
				System.out.println("Enter the Amount");
				double amount = scanner.nextDouble();
				
				System.out.println("calling withdraw : "+ amount);
				
				if(account.withdraw(amount)) {
					System.out.println("Transaction Successful");
					System.out.println("Balance : "+account.getBalance());
				}else {
					System.out.println("Transaction Failed");
				}
				break;
				
			case 2:
				System.out.println("Enter the Amount");
				amount = scanner.nextDouble();
				
				System.out.println("calling deposit : "+ amount);
				
				if(account.deposit(amount)) {
					System.out.println("Transaction Successful");
					System.out.println("Balance : "+account.getBalance());
				}else {
					System.out.println("Transaction Failed");
				}
				break;
				
			case 3:
				System.out.println("Balance : "+ account.getBalance());
				break;
				
			default:
				System.out.println("Entered invalid input");
			}
			
			System.out.println("Do you want to continue ? ");
			continueChoice = scanner.next(); 
		}while(continueChoice.equalsIgnoreCase("yes"));
		
		System.out.println("THANK YOU");
		//closing Scanner
		scanner.close();
	}

}
