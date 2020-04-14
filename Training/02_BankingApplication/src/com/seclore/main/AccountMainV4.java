package com.seclore.main;

import com.seclore.pojo.Account;
import com.seclore.pojo.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		Savings savings = new Savings(62, "virus", 2000, true);
		
		System.out.println(savings);
		
		Account account = new Account(62, "virus", 2000);
		
		System.out.println(account);
	}

}
