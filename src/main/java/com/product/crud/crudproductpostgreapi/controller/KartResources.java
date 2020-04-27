package com.product.crud.crudproductpostgreapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.crud.crudproductpostgreapi.model.RequestedProduct;
import com.product.crud.crudproductpostgreapi.repository.RequestedProductRepo;


@RestController
@RequestMapping({"/kart"})
public class KartResources {
	
	private RequestedProductRepo repository;
	
	KartResources(RequestedProductRepo requestedProductRepo) {
		this.repository = requestedProductRepo;
	}
	
	@GetMapping
	public List findAll(){
	   return repository.findAll();
	}

	@PostMapping
	public RequestedProduct create(@RequestBody RequestedProduct requestedProduct){
	   return repository.save(requestedProduct);
	}


}
