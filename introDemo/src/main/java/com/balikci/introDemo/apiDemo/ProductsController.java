package com.balikci.introDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@GetMapping("/")
	public String get() {
		return "Home Page";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "Products";
	}
}
