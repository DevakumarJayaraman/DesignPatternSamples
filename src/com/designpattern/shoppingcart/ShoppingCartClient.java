package com.designpattern.shoppingcart;

public class ShoppingCartClient {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Book book = new Book("JAVA", 10, 100);
		CD cd = new CD("Pirates of the caribean", 5, 50);
		Cosmetic cosmetic = new Cosmetic("Mascara", 2, 20);
		Computer computer=new Computer("HP",1,15000);
		
		cart.addToCart(book);
		cart.addToCart(cd);
		cart.addToCart(cosmetic);
		cart.addToCart(computer);
		
		cart.calculatePrice();
		
		book.setQuantity(20);
		computer.setQuantity(2);
		
		cart.calculatePrice();
	}
}