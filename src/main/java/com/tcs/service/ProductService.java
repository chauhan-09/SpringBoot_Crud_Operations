package com.tcs.service;
import com.tcs.entity.Product;
import java.util.List;

public interface ProductService {
   Product add_product(Product p);
   List<Product> get_all_product();
   Product get_product_by_id(Long id);
   Product update_price(Product p,Long id);
   void delete_product(Long id);
}
