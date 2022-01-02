package com.example.microservice.productservicecatalog.models;

public class ProductInfo {

	private String productid;
	private String name;

	
	public ProductInfo() {
		super();
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductInfo(String productid, String name) {
		this.productid = productid;
		this.name = name;
	}

}
