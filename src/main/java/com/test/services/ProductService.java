package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.model.Product;

@Service
public interface ProductService {
		
	public Product saveProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Integer id);
	public String deleteProduct(Integer id);
	public Product editProduct(Product product);
	public List<Product> searchProducts(String keyword);
}
