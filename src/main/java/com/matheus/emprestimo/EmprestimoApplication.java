package com.matheus.emprestimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories()
public class EmprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoApplication.class, args);
	}

}
