package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.model.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer>{
	@Query(value = "SELECT * FROM product p WHERE " +
		       "LOWER(p.prod_name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
		       "LOWER(p.prod_status) LIKE LOWER(CONCAT('%', :keyword, '%'))", 
		       nativeQuery = true)
		List<Product> searchProducts(String keyword);

}
