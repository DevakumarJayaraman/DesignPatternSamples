package com.designpattern.shoppingcart;

public class CD extends Product {

	protected boolean isImported = true;

	public CD(String name, int quantity, double actualPrice) {
		this.name = name;
		this.actualPrice = actualPrice;
		this.quantity = quantity;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
}