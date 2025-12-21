package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Product;
import com.tcs.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	ProductRepository repo;

	@Override
	public Product add_product(Product p) {
		return repo.save(p);
	}
	
	public List<Product> get_all_product() {
		return repo.findAll();
	}
}
