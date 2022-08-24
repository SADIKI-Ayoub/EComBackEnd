package com.ecommerce.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.customRepository.CustomProductRepository;
import com.ecommerce.entities.Product;
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query("select p from Product p where p.category.title = ?1")
	public List<Product> findByTitleOfCategory(String title);
}
