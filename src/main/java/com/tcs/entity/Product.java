package com.tcs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pdt_id;
	private String name;
	private Double price;
	
	public Long getPdt_id() {
		return pdt_id;
	}
	public void setPdt_id(Long pdt_id) {
		this.pdt_id = pdt_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public Product(Long pdt_id, String name, Double price) {
		super();
		this.pdt_id = pdt_id;
		this.name = name;
		this.price = price;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
