package com.designpattern.shoppingcart;

public class SalesTaxCalculator extends TaxCalculator {
	@Override
	protected void calculateTax(Product product) {
		if (product instanceof Book) {
			Book book = (Book) product;
			book.setSalesTax(book.getActualPrice() * .10);
		} else if (product instanceof CD) {
			CD cd = (CD) product;
			cd.setSalesTax(cd.getActualPrice() * .10);
		} else if (product instanceof Cosmetic) {
			Cosmetic cosmetic = (Cosmetic) product;
			cosmetic.setSalesTax(cosmetic.getActualPrice() * .10);
		} else if (product instanceof Computer) {
			Computer computer = (Computer) product;
			computer.setSalesTax(computer.getActualPrice() * .05);
		}
	}
}