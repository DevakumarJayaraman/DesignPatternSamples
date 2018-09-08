package com.designpattern.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> cartItems = new ArrayList<>();
	private List<TaxCalculator> taxCalculators = new ArrayList<>();

	public void subscribeTaxCalculator(TaxCalculator taxCalculator) {
		this.taxCalculators.add(taxCalculator);
	}

	public void addToCart(Product product) {
		cartItems.add(product);
		taxCalculators.forEach(taxCalculator -> {
			product.calculateTax(taxCalculator);
		});
	}

	public void removeFromCart(Product product) {
		cartItems.remove(product);
	}

	public void calculatePrice() {
		System.out.println("Current Cart Status");
		System.out.println("========================================================");
		double totalTax = 0;
		double totalWithoutTax = 0;
		double extendedPrice = 0;
		for (Product product : cartItems) {
			System.out.println(product);
			totalWithoutTax += product.getPriceWithoutTax();
			totalTax += product.getTotalTax();
			extendedPrice+=product.getExtendedPrice();
		}
		System.out.println("Total Without Tax : " + totalWithoutTax);
		System.out.println("Total Tax : " + totalTax);
		System.out.println("Total : " + extendedPrice);
	}
}