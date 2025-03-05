package com.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Product;
import com.test.repositories.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo prodRepo;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prodRepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id).get();
		
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product prod =  prodRepo.findById(id).get();
		if(prod != null) {
			prodRepo.delete(prod);
			return "Product deleted successfully";
		}
		return "Something went wrong";
	}
	
	@Override
	public Product editProduct(Product product) {
		// TODO Auto-generated method stub
		return prodRepo.save(product);
	}

	@Override
	public List<Product> searchProducts(String keyword) {
		// TODO Auto-generated method stub
		return prodRepo.searchProducts(keyword);
	}
	
	
	
}
