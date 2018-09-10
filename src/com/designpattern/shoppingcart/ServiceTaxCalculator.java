package com.designpattern.shoppingcart;

public class ServiceTaxCalculator extends TaxCalculator {

	@Override
	protected void calculateTax(Book book) {
		book.setServiceTax(book.getActualPrice() * 0.05);
	}

	@Override
	protected void calculateTax(CD cd) {
		cd.setServiceTax(cd.getActualPrice() * 0.05);

	}

	@Override
	protected void calculateTax(Computer computer) {
		computer.setServiceTax(computer.getActualPrice() * 0.08);

	}

	@Override
	protected void calculateTax(Cosmetic cosmetic) {
		//No tax
	}
}