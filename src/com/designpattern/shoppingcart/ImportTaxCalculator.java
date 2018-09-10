package com.designpattern.shoppingcart;

public class ImportTaxCalculator extends TaxCalculator {
	
	@Override
	protected void calculateTax(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void calculateTax(CD cd) {
		if (cd.isImported()) {
			cd.setImportTax(cd.getActualPrice() * .05);
		}

	}

	@Override
	protected void calculateTax(Computer computer) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void calculateTax(Cosmetic cosmetic) {
		// TODO Auto-generated method stub

	}
}