package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Current;

public class AccountMainV5 {
	public static void main(String[] args) {
		
		Current current;
		current  = new Current(62 ,"saurabh",10000, 50000);
		
		Current current2;
		
		current2 = current;
		
		
		/*
		 * Current current = new Current(62, "virus", 10000, 50000, 50000);
		 * System.out.println(current);
		 * 
		 * System.out.println("---------------------------------------------------");
		 * Current current2 = new Current(); System.out.println(current2);
		 * 
		 * 
		 * System.out.println("---------------------------------------------------");
		 * current2 =current; System.out.println(current2);
		 * 
		 * System.out.println("---------------------------------------------------");
		 * current2.setName("Virus"); System.out.println("Current : "+ current);
		 * System.out.println("Current2  : " + current2);
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int transactionChoice;
//		long accountNumber;
//		String name, continueChoice;
//		double balance, overdraftLimit, amount;
//		
//		
//		System.out.println("Welcome To AXIS Bank");
//		System.out.println();
//		
//		
//		System.out.println("Enter the Account Number : ");
//		accountNumber = scanner.nextLong();
//		
//		System.out.println("Enter your Name : ");
//		scanner.nextLine();
//		name = scanner.nextLine();
//		
//		System.out.println("Enter your balance : ");
//		balance = scanner.nextDouble();
//		
//		System.out.println("Enter your Overdraft Limit : ");
//		overdraftLimit = scanner.nextDouble();
//		
//		
////		current.setAccountNumber(accountNumber);
////		current.setName(name);
////		current.setBalance(balance);
////		current.setOverdraftLimit(overdraftLimit);
//		
//		Current current = new Current(accountNumber, name, balance, overdraftLimit);
//		
//		System.out.println();
//		System.out.println("Thanks for the details");
//		System.out.println("Print all the details : ");
//		
//		
//		System.out.println(current);
//		
//		do {
//			System.out.println("**********MENU***********");
//			System.out.println("1. Withdraw");
//			System.out.println("2. Deposit");
//			System.out.println("3. Balance");
//			
//			
//			System.out.println("Enter your choice (1 or 2 or 3) : ");
//			transactionChoice = scanner.nextInt();
//			
//			switch (transactionChoice) {
//			case 1:
//				System.out.println("Enter the Amount");
//				amount = scanner.nextDouble();
//				
//				System.out.println("calling withdraw : "+ amount);
//				
//				if(current.withdraw(amount)) {
//					System.out.println("Transaction Successful");
//					System.out.println("Balance : "+current.getBalance());
//					System.out.println("Overdraft Balance : " + current.getOverdraftLimit());
//				}else {
//					System.out.println("Transaction Failed");
//				}
//				break;
//				
//			case 2:
//				System.out.println("Enter the Amount");
//				amount = scanner.nextDouble();
//				
//				System.out.println("calling deposit : "+ amount);
//				
//				if(current.deposit(amount)) {
//					System.out.println("Transaction Successful");
//					System.out.println("Balance : "+current.getBalance());
//					System.out.println("Overdraft Balance : " + current.getOverdraftLimit());
//				}else {
//					System.out.println("Transaction Failed");
//				}
//				break;
//				
//			case 3:
//				System.out.println("Balance : "+ current.getBalance());
//		System.out.println("Overdraft Balance : " + current.getOverdraftLimit());
//				break;
//				
//			default:
//				System.out.println("Entered invalid input");
//			}
//			
//			System.out.println("Do you want to continue ? ");
//			continueChoice = scanner.next(); 
//		}while(continueChoice.equalsIgnoreCase("yes"));
//		
//		System.out.println("THANK YOU");
//		//closing Scanner
//		scanner.close();

		
	}

}
