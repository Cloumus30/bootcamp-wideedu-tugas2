package com.bootcamp.tugas1.repositories;

public class OrderItem {
	protected int id;
	protected int product_id;
	protected String product_name;
	protected String type;
	protected double price;
	protected int quantity;
	
	public OrderItem(int product_id, String product_name, String type, double price, int quantity) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItem : {id=" + id + ", product_id=" + product_id + ", product_name=" + product_name + ", type="
				+ type + ", price=" + price + ", quantity=" + quantity + "}";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
