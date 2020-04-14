package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Account;
import com.seclore.pojo.Current;
import com.seclore.pojo.Savings;

public class AccountMainV8 {
	static int transactionChoice = 0;
	static double balance;
	static double amount;
	static Account account = null;
	static String continueChoice = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double overdraftLimit;
		String name;
		int accountChoice;
		boolean isSalary;

		System.out.println("Welcome to XYZ bank");
		System.out.println("Menu");
		System.out.println("1..Savings Account");
		System.out.println("2..Current Account");
		accountChoice = scanner.nextInt();
		scanner.nextLine();
		switch (accountChoice) {
		case 1:
			System.out.println("Enter details for savings account");
			System.out.println("Enter name");
			name = scanner.nextLine();

			System.out.println("Do you want to open salary account");
			isSalary = scanner.nextBoolean();
			while (balanceValidation(isSalary, scanner)) {
				System.out.println("Invalid Balance");
			}
			account = new Savings(name, balance, isSalary);
			System.out.println("Account opened successfully ");
			System.out.println(account);
			break;
		case 2:
			System.out.println("Enter details for current account");
			System.out.println("Enter name");
			name = scanner.nextLine();
			System.out.println("Enter Balance");
			balance = scanner.nextDouble();
			System.out.println("Enter overdraftLimit");
			overdraftLimit = scanner.nextDouble();
			account = new Current(name, balance, overdraftLimit);
			break;
		default:
			System.out.println("Invalid Option ");
			break;
		}

	}

	static void accountTransaction(Scanner scanner) {
		do {
			System.out.println("Menu");
			System.out.println("1.. Withdraw");
			System.out.println("2.. Deposit");
			System.out.println("3.. Balance");

			System.out.println("Enter your choice");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to be withdraw");
				amount = scanner.nextInt();
				if (account.withdraw(amount))
					System.out.println("Transaction Success");
				else
					System.out.println("Transaction Failed");
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextInt();
				if (account.deposit(amount))
					System.out.println("Transaction Success");
				else
					System.out.println("Transaction Failed");
				break;

			case 3:
				System.out.println("Balance is :: " + account.getBalance());
				break;
			default:
				System.out.println("Sorry , invalid option");
				break;
			}

			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}

	static boolean balanceValidation(boolean isSalary, Scanner scanner) {
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		if (!isSalary && balance < 1500) {
			return true;
		}
		return false;
	}
}