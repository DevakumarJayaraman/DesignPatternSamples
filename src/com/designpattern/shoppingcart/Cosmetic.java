package com.designpattern.shoppingcart;

public class Cosmetic extends Product {
	public Cosmetic(String name, int quantity, double actualPrice) {
		this.name = name;
		this.quantity = quantity;
		this.actualPrice = actualPrice;
	}

	@Override
	public void calculateTax(TaxCalculator taxCalculator) {
		taxCalculator.calculateTax(this);
	}
}