package com.designpattern.visitor;

public abstract class Product {
	protected String name;
	protected int price;

	public void addTax(TaxCalculator taxCalculator) {
		taxCalculator.calculate(this);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
}