package com.tcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
