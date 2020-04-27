package com.product.crud.crudproductpostgreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.crud.crudproductpostgreapi.model.RequestedProduct;

public interface RequestedProductRepo extends JpaRepository<RequestedProduct, Integer> {

}
