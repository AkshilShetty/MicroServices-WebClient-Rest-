package com.example.microservice.productinfocatalog.resources;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservice.productinfocatalog.models.ProductInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/products")
public class ProductInfoResource {

	@RequestMapping("/{productid}")
	public ProductInfo getproductInfo(@PathVariable("productid") String productid)
	   { 
		        System.out.print("sfsfs");
		  {
	            return new ProductInfo(productid,"Test");
	       }
				
	   }	
}
