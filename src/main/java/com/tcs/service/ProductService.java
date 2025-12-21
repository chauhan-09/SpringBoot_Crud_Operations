package com.tcs.service;
import com.tcs.entity.Product;
import java.util.List;

public interface ProductService {
   Product add_product(Product p);
   List<Product> get_all_product();

}
