package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.portal.backend.domain.Address;
import com.portal.backend.domain.User;
import com.portal.backend.service.AddressService;
import com.portal.backend.service.UserService;
import com.portal.backend.starter.PortalBackendApplication;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = PortalBackendApplication.class)
public class UserServiceTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;
	
	@Test
	public void testCreateUser() {

		User user = new User();
		user.setFirstName("Anand");
		user.setLastName("Kuppast");

		Address address = new Address();
		address.setFirstStreet("#1431, 3rd Main, 8th Cross");
		address.setSecondStreet("Sanjeevininagar, Moodalapalya");
		address.setUser(user);
		address = addressService.create(address);

		user.setAddress(address);
		userService.create(user);
	}
	
}
