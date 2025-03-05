package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Product;
import com.test.services.ProductService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/")
public class ProductController {

	@Autowired
	private ProductService prodService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<?> saveProduct(@RequestBody Product product){
		return new ResponseEntity<>(prodService.saveProduct(product), HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllProducts(){
		return new ResponseEntity<>(prodService.getAllProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Integer id){
		return new ResponseEntity<>(prodService.getProductById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		return new ResponseEntity<>(prodService.deleteProduct(id), HttpStatus.OK);
	}
	
	@PutMapping("/editProduct")
	public ResponseEntity<?> editProduct(@RequestBody Product product){
		return new ResponseEntity<>(prodService.editProduct(product), HttpStatus.CREATED);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword){
		return new ResponseEntity<>(prodService.searchProducts(keyword),HttpStatus.OK);
	}
	
}
