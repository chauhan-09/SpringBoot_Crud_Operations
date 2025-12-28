package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public Product get_product_by_id(@PathVariable Long id) {
		return service.get_product_by_id(id);
	}
	
	@PutMapping("/{id}")
	public Product update_product_price(@RequestBody Product p , @PathVariable Long id) {
		return service.update_price(p,id);
	}
	
	@DeleteMapping("/{id}")
	public String delete_product(@PathVariable Long id) {
		service.delete_product(id);
		return "deleted successfully";
	}
}
