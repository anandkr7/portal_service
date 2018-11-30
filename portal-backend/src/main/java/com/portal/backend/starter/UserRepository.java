package com.portal.backend.starter;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.backend.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void delete(User user);

    List<User> findAll();

    @SuppressWarnings("unchecked")
	User save(User user);
}
