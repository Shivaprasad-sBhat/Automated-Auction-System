package com.question4;

public class Product {

	String name ; 
	double price ;
	String company ; 
	int count ;
	
	public Product() {
		
	}

	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}

	@Override
	public String toString() {
		return "\n Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]\n";
	}
	
	
}
