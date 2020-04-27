package com.product.crud.crudproductpostgreapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.crud.crudproductpostgreapi.model.Product;
import com.product.crud.crudproductpostgreapi.repository.ProductRepo;

@RestController
@RequestMapping({"/products"})
public class ProductResources {
	
	private ProductRepo repository;
	
	ProductResources(ProductRepo productRepo) {
		this.repository = productRepo;
	}
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?>findById(@PathVariable Long id){
	   return repository.findById(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public Product create(@RequestBody Product product){
	   return repository.save(product);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Product product) {
	   return repository.findById(id)
	           .map(record -> {
	               record.setProductDescription(product.getProductDescription());
	               record.setProductName(product.getProductName());
	               record.setProductPrice(product.getProductPrice());
	               Product updated = repository.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity<?> delete(@PathVariable Long id) {
	   return repository.findById(id)
	           .map(record -> {
	               repository.deleteById(id);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}

}
