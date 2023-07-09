package com.wordle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordle.data.Client;
import com.wordle.data.ClientRepository;

@Service
public class LoginService {
	
	@Autowired
	private ClientRepository clientRepository;

	public boolean validateUser(Client client) {
		return (clientRepository.findByUsernameAndPassword(client.getUsername(), client.getPassword()).size() != 0);
	}

}
