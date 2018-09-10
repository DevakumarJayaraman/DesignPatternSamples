package com.designpattern.shoppingcart;

public class SalesTaxCalculator extends TaxCalculator {

	@Override
	protected void calculateTax(Book book) {
		// No tax
	}

	@Override
	protected void calculateTax(CD cd) {
		cd.setSalesTax(cd.getActualPrice() * 0.05);
	}

	@Override
	protected void calculateTax(Computer computer) {
		computer.setSalesTax(computer.getActualPrice() * 0.07);
	}

	@Override
	protected void calculateTax(Cosmetic cosmetic) {
		cosmetic.setSalesTax(cosmetic.getActualPrice() * 0.8);
	}
}