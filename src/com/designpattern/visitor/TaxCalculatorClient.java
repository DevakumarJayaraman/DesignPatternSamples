package com.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculatorClient {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Book("Science", 100));
		products.add(new Pen("Parker", 80));
		products.add(new Pencil("natraj", 20));

		products.forEach(p -> {
			System.out.println("Price Without Tax for " + p.getName() + " " + p.getClass().getSimpleName() + " is "
					+ p.getPrice());
		});
		
		TaxCalculator cgstCalculator = new CGSTCalculator();
		products.forEach(p -> {
			p.addTax(cgstCalculator);
		});
		
		products.forEach(p -> {
			System.out.println("Price After CGST for " + p.getName() + " " + p.getClass().getSimpleName() + " is "
					+ p.getPrice());
		});

		TaxCalculator sgstCalculator = new SGSTCalculator();
		products.forEach(p -> {
			p.addTax(sgstCalculator);
		});
		
		products.forEach(p -> {
			System.out.println("Price After SGST for " + p.getName() + " " + p.getClass().getSimpleName() + " is "
					+ p.getPrice());
		});
		
		TaxCalculator serviceTaxCalculator = new ServiceTaxCalculator();
		products.forEach(p -> {
			p.addTax(serviceTaxCalculator);
		});

		products.forEach(p -> {
			System.out.println("Price After Service Tax for " + p.getName() + " " + p.getClass().getSimpleName() + " is "
					+ p.getPrice());
		});
	}
}