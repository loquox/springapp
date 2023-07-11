package com.loquox.springapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.loquox.springapp.beans.Product;

@Service
public class ProductService {

	public List<Product> productList() {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("coca", 23));
		products.add(new Product("fanta", 34));
		
		
		return products;
	}
	
	

}
