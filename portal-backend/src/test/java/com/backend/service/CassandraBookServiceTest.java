package com.backend.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.datastax.driver.core.utils.UUIDs;
import com.portal.backend.config.CassandraConfig;
import com.portal.backend.domain.Book;
import com.portal.backend.repository.BookCassandraRepository;
import com.portal.backend.starter.PortalBackendApplication;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = { CassandraConfig.class,
		PortalBackendApplication.class })
public class CassandraBookServiceTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private BookCassandraRepository bookCassandraRepository;

	@Test
	public void testCassandraBookSave() {

		Book javaBook = new Book(UUIDs.timeBased(), "Head First Java", "O'Reilly Media", new HashSet<>());
		bookCassandraRepository.save(javaBook);
		
	}

}
