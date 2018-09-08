package com.designpattern.shoppingcart;

public class ServiceTaxCalculator extends TaxCalculator {
	@Override
	protected void calculateTax(Product product) {
		if (product instanceof Book) {
			Book book = (Book) product;
			book.setSalesTax(book.getActualPrice() * .01);
		} else if (product instanceof CD) {
			CD cd = (CD) product;
			cd.setSalesTax(cd.getActualPrice() * .01);
		} else if (product instanceof Cosmetic) {
			Cosmetic cosmetic = (Cosmetic) product;
			cosmetic.setSalesTax(cosmetic.getActualPrice() * .01);
		}else if (product instanceof Computer) {
			Computer computer = (Computer) product;
			computer.setServiceTax(computer.getActualPrice() * .05);
		}
	}
}