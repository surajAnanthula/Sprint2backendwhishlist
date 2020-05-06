package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Whishlistedproducts")
public class Product {
	@Id
	@Column(length=5)
	private int productId;
	@Column(length=20)
	private String productCatogery;
	@Column(length=20)
	private String productName;

		
	public Product(int productId, String productCatogery, String productName) {
		super();
		this.productId = productId;
		this.productCatogery = productCatogery;
		this.productName = productName;
	}
	
	public Product() {
	
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCatogery() {
		return productCatogery;
	}
	public void setProductCatogery(String productCatogery) {
		this.productCatogery = productCatogery;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}


		
		
}