package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Account;

public class AccountMainV1 {
	public static void main(String[] args) {
		//Object Creation
		Account account = new Account();
		
//		account.accountNumber = 62;
//		account.name = "Saurabh Singh";
//		account.balance = 1000;
//		
//		System.out.println("Account : "+account.accountNumber);
//		System.out.println("Name : "+account.name);
//		System.out.println("Balance : "+account.balance);
		
		account.setAccountNumber(62);
		account.setName("Saurabh Singh");
		account.setBalance(1000);
		
		System.out.println("Account Number : "+ account.getAccountNumber());
		System.out.println("Name : "+ account.getName());
		System.out.println("Balance : "+ account.getBalance());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		
		System.out.println("calling withdraw : "+ amount);
		
		if(account.withdraw(amount)) {
			System.out.println("Transaction Success");
			System.out.println("Balance : "+account.getBalance());
		}else {
			System.out.println("Transaction Failed");
		}
		
		if(account.deposit(amount)) {
			System.out.println("Transaction Success");
			System.out.println("Balance : "+account.getBalance());
		}else {
			System.out.println("Transaction Failed");
		}
		scanner.close();
		
	}

}
