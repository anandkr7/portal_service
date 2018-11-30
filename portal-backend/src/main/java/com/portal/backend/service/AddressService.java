package com.portal.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.portal.backend.domain.Address;

@Service
public interface AddressService {

	Address create(Address Address);

	Address findById(int id);

	Address update(Address Address);

	List findAll();
	
}
