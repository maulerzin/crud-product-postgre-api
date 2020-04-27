package com.product.crud.crudproductpostgreapi.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   
   @NotBlank
   @Size(max = 30)
   private String productName;
   
   @NotBlank
   @Size(max = 100)
   private String productDescription;

   private Double  productPrice;
   
   public Product() {
		
   }

   public Product(String productName, String productDescription, Double productPrice) {
   	this.productDescription = productDescription;
   	this.productName = productName;
   	this.productPrice = productPrice;
   }

   
   public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
}