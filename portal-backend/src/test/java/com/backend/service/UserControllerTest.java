package com.backend.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import com.portal.backend.domain.Address;
import com.portal.backend.domain.User;
import com.portal.backend.service.AddressService;
import com.portal.backend.service.UserService;

@RunWith(SpringRunner.class)
@EnableJpaRepositories(basePackages = "com.portal.backend.repository")
@ComponentScan({ "com.portal.backend.service", "com.portal.backend.repository" })
public class UserControllerTest extends BaseTest {

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
