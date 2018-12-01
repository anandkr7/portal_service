package com.portal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.backend.domain.Address;
import com.portal.backend.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address create(Address Address) {
		return addressRepository.save(Address);
	}

	@Override
	public List findAll() {
		return addressRepository.findAll();
	}

	@Override
	public Address update(Address Address) {
		return null;
	}

	@Override
	public Address findById(int id) {
		return null;
	}

}
