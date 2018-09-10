package com.designpattern.shoppingcart;

public abstract class Product {
	protected String name;
	protected double actualPrice;
	private double salesTax;
	private double importTax;
	private double serviceTax;
	protected double quantity;

	protected boolean isImported = false;

	public double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public double getImportTax() {
		return importTax;
	}

	public void setImportTax(double importTax) {
		this.importTax = importTax;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

	public double getPriceWithoutTax() {
		return this.getQuantity() * this.getActualPrice();
	}

	public double getTotalTax() {
		return this.getQuantity() * (this.getImportTax() + this.getSalesTax() + this.getServiceTax());
	}

	public double getExtendedPrice() {
		return this.getPriceWithoutTax()+this.getTotalTax();
	}

	public double getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(double serviceTax) {
		this.serviceTax = serviceTax;
	}
	
	public abstract void calculateTax(TaxCalculator taxCalculator);
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", actualPrice=" + actualPrice + ", quantity=" + quantity
				+ ", getPriceWithoutTax()=" + getPriceWithoutTax() + ", getTotalTax()=" + getTotalTax()
				+ ", getExtendedPrice()=" + getExtendedPrice() + "]";
	}


}