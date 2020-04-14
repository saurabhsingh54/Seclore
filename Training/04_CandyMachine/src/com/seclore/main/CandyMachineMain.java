package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.CashRegister;
import com.seclore.pojo.DispenserType;



public class CandyMachineMain {
	public static int change,amount;
	static CashRegister cashRegister = new CashRegister();
	static DispenserType dispenserType = new DispenserType();
	static Scanner scanner = new Scanner(System.in);
	static DispenserType candies = new DispenserType();
	static DispenserType chips = new DispenserType(50,150);
	static DispenserType gums = new DispenserType(50,50);
	static DispenserType cookies = new DispenserType(30,250);

	public static void main(String[] args) {
		int itemChoice;
		String continueChoice;
		
		do {
			System.out.println();
			System.out.println("*******Candy Machine*********");
			System.out.println("    menu          Items         costs ");
			System.out.println(" 1. candies         "+candies.getNumberOfItems()+"           "+candies.getCost());
			System.out.println(" 2. chips           "+chips.getNumberOfItems()+"           "+chips.getCost());
			System.out.println(" 3. gums            "+gums.getNumberOfItems()+"           "+gums.getCost());
			System.out.println(" 4. Cookies         "+cookies.getNumberOfItems()+"           "+cookies.getCost());
			itemChoice = scanner.nextInt();

			switch (itemChoice) {
			case 1:
				System.out.println("Cost of the selected item is : " + candies.getCost());
				while(Amount(candies.getCost())) {
					System.out.println("Or Press -1 to cancelled the transaction");
					amount = scanner.nextInt();
					if(amount == -1)
						break;
				}if(amount>0)
					candies.setNumberOfItems(candies.getNumberOfItems()-1);
				break;
			case 2:
				System.out.println("Cost of the selected item is : " + chips.getCost());
				while(Amount(chips.getCost())) {
					System.out.println("Or Press -1 to cancelled the transaction");
					amount = scanner.nextInt();
					if(amount == -1)
						break;
				}if(amount>0)
					chips.setNumberOfItems(chips.getNumberOfItems()-1);
				break;
			case 3:
				System.out.println("Cost of the selected item is : " + gums.getCost());
				while(Amount(gums.getCost())) {
					System.out.println("Or Press -1 to cancelled the transaction");
					amount = scanner.nextInt();
					if(amount == -1)
						break;
				}if(amount>0)
					gums.setNumberOfItems(gums.getNumberOfItems()-1);
				break;
			case 4:
				System.out.println("Cost of the selected item is : " + cookies.getCost());
				while(Amount(cookies.getCost())) {
					System.out.println("Or Press -1 to cancelled the transaction");
					amount = scanner.nextInt();
					if(amount == -1)
						break;
				}if(amount>0)
					cookies.setNumberOfItems(cookies.getNumberOfItems()-1);
				break;
			default:
				System.out.println("Please Enter Valid selection");
			}
			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		System.out.println("Thank you for Buying....");
		scanner.close();
	}

	public static boolean Amount(int cost) {
		System.out.println("Enter the Money : " );
		amount = scanner.nextInt();
		
		if(amount > cost) {
		change = amount - cost;
		System.out.println("Take your Change : " + change);
		cashRegister.acceptAmount(amount - change);
		if(dispenserType.makeSale()) {
			System.out.println("Enjoy your Day ");
		}else {
			System.out.println("Product is out of stock ");
		}
		return false;
	}
	else if(amount == cost) {
		cashRegister.acceptAmount(cost);
		if(dispenserType.makeSale()) {
			System.out.println("Enjoy your Day ");
		}else {
			System.out.println("Product is out of stock ");
		}
		return false;
	}
	else {
		System.out.print("Please Enter the sufficient amount ");
		return true;
	}
	}

}
