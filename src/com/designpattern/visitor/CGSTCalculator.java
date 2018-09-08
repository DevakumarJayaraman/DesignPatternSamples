package com.designpattern.visitor;

public class CGSTCalculator implements TaxCalculator {

	@Override
	public void calculate(Product product) {
		product.setPrice(product.getPrice() + (product.getPrice() * 5 / 100));
	}
}