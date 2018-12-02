package com.portal.backend.repository;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.portal.backend.domain.Book;

@Repository
public interface BookCassandraRepository extends CassandraRepository<Book, UUID> {

}
