package com.bootcamp.tugas1.repositories;

import java.util.List;

public class Product {
	int id;
	String name;
	double price;
	Type type;
	int type_id;
	
	
	
	public Product(int id, String name, double price, int type_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type_id = type_id;
	}
	
	public Product(String name, double price, int type_id) {
		super();
		this.name = name;
		this.price = price;
		this.type_id = type_id;
	}
	
	public Product(int id, String name, double price, int type_id, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type_id = type_id;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	
	
}
