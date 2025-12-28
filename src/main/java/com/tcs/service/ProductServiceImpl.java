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

	public Product add_product(Product p) {
		return repo.save(p);
	}
	
	public List<Product> get_all_product() {
		return repo.findAll();
	}

	public Product get_product_by_id(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Product update_price(Product p,Long id) {
		Product pdt = repo.findById(id).orElse(null);
		pdt.setPrice(p.getPrice());
		return repo.save(pdt);
	}

	public void delete_product(Long id) {
		repo.deleteById(id);
	}
}
