package com.wordle.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	List<Client> findByUsername(String username);
	
	List<Client> findByUsernameAndPassword(String username, String password);
	
}