package com.portal.backend.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.backend.domain.Pets;
import com.portal.backend.repository.PetsRepository;

@Service
public class PetsServiceImpl implements PetsService {

	@Autowired
	private PetsRepository petsRepository;
	
	@Override
	public Pets create(Pets pets) {
		return petsRepository.save(pets);
	}

	@Override
	public Pets findById(ObjectId id) {
		return petsRepository.findBy_id(id);
	}

	@Override
	public Pets update(Pets pets) {
		return null;
	}

	@Override
	public List<Pets> findAll() {
		return null;
	}

}
