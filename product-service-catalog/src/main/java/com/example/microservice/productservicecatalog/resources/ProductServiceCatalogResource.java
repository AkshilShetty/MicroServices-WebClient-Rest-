package com.example.microservice.productservicecatalog.resources;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.microservice.productservicecatalog.models.CatalogItem;
import com.example.microservice.productservicecatalog.models.ProductDataService;
import com.example.microservice.productservicecatalog.models.ProductInfo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/catalog")
public class ProductServiceCatalogResource {

	@Autowired
	private RestTemplate resttemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	   { 
		
		 //get product id
		//for each product id call product info service
		//put them all together
		List<ProductDataService> ratings = Arrays.asList(
				new ProductDataService("1234",4),
				new ProductDataService("5678",10)
				);
		
	        return ratings.stream().map(rating -> {
			    
	        //	ProductInfo movie =	resttemplate.getForObject("http://localhost:2022/products/"+rating.getProductid(), ProductInfo.class);/*
			
	            
	        	
	            ProductInfo movie = webClientBuilder.build()
	            		.get()
	            		.uri("http://localhost:2022/products/"+rating.getProductid()).retrieve().bodyToMono(ProductInfo.class).block();
	        			
	        	return new CatalogItem (movie.getName(),"Test",rating.getRating());
	   }).collect(Collectors.toList());
		
		
		
	 }
}
