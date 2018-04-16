package com.bolt.license.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.bolt.license.core.model.BidDetails;

public interface BidDetailsRepo extends CrudRepository<BidDetails, ObjectId> {
	List<BidDetails> findByCName(String cName);

	public BidDetails findByBiddedBy(String name);
}
