package com.portal.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.portal.backend.domain.Address;
import com.portal.backend.domain.User;
import com.portal.backend.service.AddressService;
import com.portal.backend.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/rest"})
public class LandingPageController {

	@Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;
    
    @RequestMapping(value = "/createUser", method = RequestMethod.GET)
    public User createUser(){
    	User user = new User();
    	user.setFirstName("Anand");
    	user.setLastName("Kuppast");
    	
    	Address address = new Address();
    	address.setFirstStreet("#1431, 3rd Main, 8th Cross");
    	address.setSecondStreet("Sanjeevininagar, Moodalapalya");
    	address.setUser(user);
    	address = addressService.create(address);
    	
    	user.setAddress(address);
        return userService.create(user);
    }
	
}
