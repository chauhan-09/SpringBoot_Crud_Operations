package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.tcs.entity.*;
import com.tcs.service.ProductService;

@RequestMapping("/products")
@RestController
public class ProductController {
   
	@Autowired
	ProductService service;
	
	@PostMapping
	public Product add(@RequestBody Product p) {
		return service.add_product(p);
	}
	
	
	
	@GetMapping
	public List<Product> get_product() {
		return service.get_all_product();
	}
}
