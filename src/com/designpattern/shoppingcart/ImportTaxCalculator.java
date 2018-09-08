package com.designpattern.shoppingcart;

public class ImportTaxCalculator extends TaxCalculator {
	@Override
	protected void calculateTax(Product product) {
		if (product instanceof CD) {
			CD cd = (CD) product;
			if (cd.isImported()) {
				cd.setImportTax(cd.getActualPrice() * .05);
			}
		}else if (product instanceof Computer) {
			Computer computer = (Computer) product;
			computer.setImportTax(computer.getActualPrice() * .05);
		}
	}
}