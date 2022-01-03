package com.example.microservice.productdataservice.models;

public class ProductDataService {
	private String productid;
	private int rating;
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public ProductDataService(String productid, int rating) {
		this.productid = productid;
		this.rating = rating;
	}
	
}
