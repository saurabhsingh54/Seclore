package com.seclore.pojo;

public class Savings extends Account{
	private boolean isSalary;
	
	public Savings() {
		System.out.println("Default constructor of Savings");
	}
	
	public Savings(long accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("parameterise constructor of savings");
	}
	
	public Savings(String name, double balance, boolean isSalary) {
		super(name, balance);
		this.isSalary = isSalary;
		System.out.println("parameterise constructor of savings");
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount > 0 && getBalance() >= amount) {
			setBalance(getBalance() - amount);
			return true;
		}
		if(amount > 0 && isSalary == false && getBalance() - amount >= 1500) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		if(amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
	
	
	
	
	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "Savings : \n  isSalary=" + isSalary + ",\n  getAccountNumber()=" + getAccountNumber() + ",\n  getName()="
				+ getName() + ",\n  getBalance()=" + getBalance();
	}
	
	
	
}
