package com.portal.backend.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.portal.backend.domain.Pets;

@Repository
@Component
public interface PetsRepository extends MongoRepository<Pets, String> {
	Pets findBy_id(ObjectId _id);
}
