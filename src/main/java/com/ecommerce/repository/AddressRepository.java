package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.entities.Address;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
