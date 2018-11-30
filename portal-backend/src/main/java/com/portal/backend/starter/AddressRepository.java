package com.portal.backend.starter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.portal.backend.domain.Address;

@Repository
@Component
public interface AddressRepository extends JpaRepository<Address, Long> {

	void delete(Address address);

	List<Address> findAll();

	@SuppressWarnings("unchecked")
	Address save(Address address);

}
