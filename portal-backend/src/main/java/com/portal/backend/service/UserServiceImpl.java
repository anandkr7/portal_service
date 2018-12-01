package com.portal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.backend.domain.User;
import com.portal.backend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
        	userRepository.delete(user);
        }
        return user;
    }

    @Override
    public List findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return null;
    }

	@Override
	public User findById(int id) {
		return null;
	}
}
