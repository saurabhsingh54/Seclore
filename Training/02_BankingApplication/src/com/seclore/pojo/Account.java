package com.seclore.pojo;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private static long accountNumberIncrementer = 101;
	
	public Account() {
		System.out.println("Default constructor of Account");
	}
	
	//constructor Overloading
	public Account(long accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		System.out.println("parameterise constructor of Account");
	}
	
	public Account(String name, double balance) {
		accountNumber = accountNumberIncrementer;
		accountNumberIncrementer++;
		this.name = name;
		this.balance = balance;
		System.out.println("parameterise constructor of Account");
	}
	public boolean withdraw(double amount) {
		if(amount >0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
