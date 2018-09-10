package com.designpattern.shoppingcart;

public abstract class TaxCalculator {
	protected abstract void calculateTax(Book book);

	protected abstract void calculateTax(CD cd);

	protected abstract void calculateTax(Computer computer);

	protected abstract void calculateTax(Cosmetic cosmetic);
}