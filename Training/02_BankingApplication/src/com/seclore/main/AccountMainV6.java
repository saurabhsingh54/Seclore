package com.seclore.main;

import com.seclore.pojo.Current;
import com.seclore.pojo.Savings;

class MyClass{
	int num1 = 10;
	static int num2 = 10;
	
	public void print() {
		System.out.println("Value of non static variable : "+ num1);
		System.out.println("Value of static variable : "+ num2);
		num1++;
		num2++;
		System.out.println("Value of non static variable : "+ num1);
		System.out.println("Value of static variable : "+ num2);
	}
}

public class AccountMainV6 {
	
	public static void main(String[] args) {
//		MyClass obj = new MyClass();
//		obj.print();
//		
//		System.out.println("--------------------------------");
//		
//		MyClass obj2 = new MyClass();
//		obj2.print();
		
		
		Savings savings = new Savings("Test1", 1000, true);
		System.out.println(savings);
		
		Current current = new Current("Test2", 10000, 50000);
		System.out.println(current);
		
		
	}

}
