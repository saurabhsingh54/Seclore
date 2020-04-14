package com.seclore.pojo;

public class Current extends Account {
	private double overdraftLimit;
	private double overdraftBalance;
	public Current() {
		System.out.println("Default constructor of current Account");
	}
	
	public Current(long accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		overdraftBalance = overdraftLimit;
		System.out.println("param. constructor of Current Account");
	}
	
	public Current( String name, double balance, double overdraftLimit) {
		super(name, balance);
		this.overdraftLimit = overdraftLimit;
		overdraftBalance = overdraftLimit;
		System.out.println("param. constructor of Current Account");
	}
	
	
	@Override
	public boolean withdraw(double amount) {
		if(amount > 0 && getBalance() + overdraftBalance >= amount) {
			if(amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}else {
				
				setOverdraftLimit(overdraftBalance + getBalance() - amount);
				setBalance(0);
				return true;
			}

		}
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		if(amount > 0 && getBalance() == 0 && overdraftLimit >= amount + overdraftBalance) {
			setOverdraftLimit(amount + overdraftBalance);
			return true;
		}
		else if(amount > 0 && overdraftLimit < amount + overdraftBalance) {
			setBalance((overdraftBalance + amount) - overdraftLimit);
			overdraftBalance = overdraftLimit;
			setOverdraftLimit(overdraftLimit);
			return true;
		}
		return false;
	}
	

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {
		return "Current :\n  overdraftLimit=" + overdraftLimit + ",\n  overdraftBalance=" + overdraftBalance
				+ ",\n  getAccountNumber()=" + getAccountNumber() + ",\n  getName()=" + getName() + ",\n  getBalance()="
				+ getBalance();
	}
	
	
	
}
