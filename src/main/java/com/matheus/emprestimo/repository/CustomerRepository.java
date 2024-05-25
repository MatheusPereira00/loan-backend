package com.matheus.emprestimo.repository;

import com.matheus.emprestimo.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
