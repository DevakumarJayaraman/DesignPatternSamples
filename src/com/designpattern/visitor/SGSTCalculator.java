package com.designpattern.visitor;

public class SGSTCalculator implements TaxCalculator {
	@Override
	public void calculate(Product product) {
		product.setPrice(product.getPrice() + (product.getPrice() * 7 / 100));
	}
}