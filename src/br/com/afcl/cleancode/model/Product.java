package br.com.afcl.cleancode.model;

public class Product {
	
	private String name;
	private double price;
	
	private Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public static Product buildNewProduct(final String name, final double price) {
		return new Product(name, price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
