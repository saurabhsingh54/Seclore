package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Current;
import com.seclore.pojo.Savings;

public class AccountMainV7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings;
		Current current;
		
		int accountChoice, transactionChoice;
		String name, isSalary, continueChoice;
		double balance,overdraftLimit, amount;
		
		
		System.out.println("Welcome to HELLO Bank");
		System.out.println();
		
		System.out.println("1. Open new Savings Account");
		System.out.println("2. Open new Current Account");
		accountChoice = scanner.nextInt();
		
		switch (accountChoice) {
		case 1:
			System.out.println("Enter your Name : ");
			scanner.nextLine();
			name = scanner.nextLine();
			
			System.out.println("Enter your balance : ");
			balance = scanner.nextDouble();
			
			System.out.println("Do you want to open a Salary Account - Yes or No");
			isSalary = scanner.next();
			
			if(isSalary.equalsIgnoreCase("yes")){
				savings = new Savings(name, balance, true);
			}else {
				if(balance >= 1500) {
					savings = new Savings(name, balance, false);
				}else {
					System.out.println("Please Enter the amount more than 1500.0/- ");
					balance = scanner.nextDouble();
					savings = new Savings(name, balance, false);
				}
			}
			System.out.println();
			System.out.println(savings);
			System.out.println();
			do {
				System.out.println("*************MENU***************");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Balance");
				
				System.out.println("Enter your choice (1 or 2 or 3) : ");
				transactionChoice = scanner.nextInt();
				
				switch (transactionChoice) {
				case 1:
					System.out.println("Enter the Amount");
					amount = scanner.nextDouble();
					
					System.out.println("calling withdraw : "+ amount);
					
					if(savings.withdraw(amount)) {
						System.out.println("Transaction Successful");
						System.out.println("Balance : "+savings.getBalance());
					}else {
						System.out.println("Transaction Failed");
					}
					break;
					
				case 2:
					System.out.println("Enter the Amount");
					amount = scanner.nextDouble();
					
					System.out.println("calling deposit : "+ amount);
					
					if(savings.deposit(amount)) {
						System.out.println("Transaction Successful");
						System.out.println("Balance : "+savings.getBalance());
					}else {
						System.out.println("Transaction Failed");
					}
					break;
					
				case 3:
					System.out.println("Balance : "+ savings.getBalance());
					break;
					
				default:
					System.out.println("Entered invalid input");
				}
				
				System.out.println("Do you want to continue ? ");
				continueChoice = scanner.next(); 
			}while(continueChoice.equalsIgnoreCase("yes"));
			break;
		case 2:
			System.out.println("Enter your Name : ");
			scanner.nextLine();
			name = scanner.nextLine();
			
			System.out.println("Enter your balance : ");
			balance = scanner.nextDouble();
			
			System.out.println("Enter the Overdraft Limit : ");
			overdraftLimit = scanner.nextDouble();
			
			current = new Current(name, balance, overdraftLimit);
			
			System.out.println();
			System.out.println(current);
			System.out.println();
			do {
				System.out.println("*************MENU***************");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Balance");
				
				System.out.println("Enter your choice (1 or 2 or 3) : ");
				transactionChoice = scanner.nextInt();
				
				switch (transactionChoice) {
				case 1:
					System.out.println("Enter the Amount");
					amount = scanner.nextDouble();
					
					System.out.println("calling withdraw : "+ amount);
					
					if(current.withdraw(amount)) {
						System.out.println("Transaction Successful");
						System.out.println("Balance : "+current.getBalance());
						System.out.println("Overdraft Balance : " + current.getOverdraftLimit());
					}else {
						System.out.println("Transaction Failed");
					}
					break;
					
				case 2:
					System.out.println("Enter the Amount");
					amount = scanner.nextDouble();
					
					System.out.println("calling deposit : "+ amount);
					
					if(current.deposit(amount)) {
						System.out.println("Transaction Successful");
						System.out.println("Balance : "+current.getBalance());
						System.out.println("Overdraft Balance : " + current.getOverdraftLimit());
					}else {
						System.out.println("Transaction Failed");
					}
					break;
					
				case 3:
					System.out.println("Balance : "+ current.getBalance());
					System.out.println("Overdraft Balance : " + current.getOverdraftLimit());
					break;
					
				default:
					System.out.println("Entered invalid input");
				}
				
				System.out.println("Do you want to continue ? ");
				continueChoice = scanner.next(); 
			}while(continueChoice.equalsIgnoreCase("yes"));
		}
		
		System.out.println("Thank you for Banking with us.");

		//closing Scanner
		scanner.close();
	}

}
