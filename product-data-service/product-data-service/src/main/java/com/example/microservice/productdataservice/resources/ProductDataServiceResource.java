package com.example.microservice.productdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.productdataservice.models.ProductDataService;


@RestController
@RequestMapping("/ratingsdata")
public class ProductDataServiceResource {

	@RequestMapping("/{productid}")
	public ProductDataService getProductDataService(@PathVariable("productid") String productid)
	   { 
	       
           return new ProductDataService(productid,10);
      
	   }	
	
	
	
}
