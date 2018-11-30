package com.portal.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portal.backend.domain.Address;
import com.portal.backend.domain.User;
import com.portal.backend.service.AddressService;
import com.portal.backend.service.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public User create(){
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
    
    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List findAll(){
        return userService.findAll();
    }
}
