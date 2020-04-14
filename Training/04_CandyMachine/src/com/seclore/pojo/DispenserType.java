package com.seclore.pojo;

public class DispenserType {
	private int numberOfItems;
	public int cost;
	
	public DispenserType() {
		numberOfItems = 50;
		cost = 100;
	}
	
	public DispenserType(int numberOfItems, int cost) {
		this.numberOfItems = numberOfItems;
		this.cost = cost;
	}
	
	public boolean makeSale() {
		if(getNumberOfItems() > 0) {
			return true;
		}else
			return false;
		
	}
	
	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
