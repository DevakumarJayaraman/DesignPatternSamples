package com.designpattern.shoppingcart;

public class Book extends Product {
	public Book(String name, int quantity,double actualPrice) {
		this.name = name;
		this.quantity = quantity;
		this.actualPrice=actualPrice;
	}
}