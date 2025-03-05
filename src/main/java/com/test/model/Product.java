package com.test.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Product {
	
	@Id
	private Integer prod_id;
	
	private String prod_name;
	
	private Double prod_price;
	
	private String prod_status;
	
	public Integer getProd_id() {
		return prod_id;
	}
	
	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}
	
	public String getProd_name() {
		return prod_name;
	}
	
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public Double getProd_price() {
		return prod_price;
	}
	
	public void setProd_price(Double prod_price) {
		this.prod_price = prod_price;
	}
	
	public String getProd_status() {
		return prod_status;
	}
	
	public void setProd_status(String prod_status) {
		this.prod_status = prod_status;
	}



}
