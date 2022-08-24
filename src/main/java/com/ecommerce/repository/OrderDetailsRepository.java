package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entities.OrderDetails;
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "orderDetails", path = "orderDetails")
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{

}
