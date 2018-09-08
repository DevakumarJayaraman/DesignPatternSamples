package com.designpattern.visitor;

public class ServiceTaxCalculator implements TaxCalculator {
	@Override
	public void calculate(Product product) {
		product.setPrice(product.getPrice() + (product.getPrice() * 1 / 100));
	}
}
