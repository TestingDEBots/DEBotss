package com.bolt.license.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.bolt.license.core.model.User;

public interface UserRepo extends CrudRepository<User, ObjectId> {
	public List<User> findByName(String name);

	public User findByContact(String contact);
}
