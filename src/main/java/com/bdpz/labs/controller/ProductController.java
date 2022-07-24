package com.bdpz.labs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdpz.labs.service.ProductService;

@Controller
@RequestMapping("/api/v1/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@DeleteMapping("/{id}")
	public ResponseEntity<?> remove(@PathVariable("id") Long id) {
		productService.remove(id);
		return ResponseEntity.noContent().build();
	}

}
