package com.estore.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estore.domain.Product;
import com.estore.repository.ProductsRepository;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstorePrimaryEndpoint {
	
	@Autowired
	ProductsRepository productsRepository;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productsRepository.findAll();
	}
}
