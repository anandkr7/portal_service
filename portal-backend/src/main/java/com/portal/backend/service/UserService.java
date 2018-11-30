package com.portal.backend.service;

import java.util.List;

import com.portal.backend.domain.User;

public interface UserService {

	User create(User user);

	User findById(int id);

	User update(User user);

	User delete(int id);

	List findAll();

}
