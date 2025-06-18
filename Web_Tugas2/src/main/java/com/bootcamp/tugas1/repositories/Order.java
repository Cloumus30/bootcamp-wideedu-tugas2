package com.bootcamp.tugas1.repositories;

import java.util.List;

public class Order {
	protected int id;
	protected String customer_name;
	protected String address;
	protected double total;
	protected List<OrderItem> orderItems;
	
	public Order(String customer_name, String address, List<OrderItem> orderItems) {
		super();
		this.customer_name = customer_name;
		this.address = address;
		this.orderItems = orderItems;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double countTotalPrice() {
		double totalPrice = 0;
		for (OrderItem orderItem : this.orderItems) {
			totalPrice += orderItem.getPrice() * orderItem.getQuantity();
		}
		this.total = totalPrice;
		return totalPrice;
	}
}
