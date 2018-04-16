package com.bolt.license.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.bolt.license.core.model.Product;

public interface ProductRepo extends CrudRepository<Product, ObjectId> {
	public List<Product> findByName(String pName);
}
