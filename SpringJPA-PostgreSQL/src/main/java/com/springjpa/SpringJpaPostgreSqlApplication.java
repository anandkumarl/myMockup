package com.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.repo.CustomerRepository;

@SpringBootApplication
public class SpringJpaPostgreSqlApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository repository;
<<<<<<< HEAD
	/*Main Method - Removed*/
=======
	/*Main Method - First commit*/
>>>>>>> bcaeb87cfb01f032803d9bc69ac5313c2452473e
	public static void main(String[] args){
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// clear all record if existed before do the tutorial with new data 
		repository.deleteAll();
	}
}
