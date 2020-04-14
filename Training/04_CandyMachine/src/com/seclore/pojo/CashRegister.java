package com.seclore.pojo;

public class CashRegister {
	private int cashOnHand;
	
	public CashRegister() {
		cashOnHand = 500;
	}
	
	public CashRegister(int currentBalance) {
		this.cashOnHand = currentBalance;
	}
	
	public void acceptAmount(int cash) {
		setCashOnHand(getCashOnHand()+cash);
	}


	public int getCurrentBalance() {
		return cashOnHand;
	}
	public int getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

}
