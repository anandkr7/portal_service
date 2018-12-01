package com.portal.backend.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import com.portal.backend.domain.Pets;

@Service
public interface PetsService {

	Pets create(Pets pets);

	Pets update(Pets pets);

	List<Pets> findAll();

	Pets findById(ObjectId id);
	
}
