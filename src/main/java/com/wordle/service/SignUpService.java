package com.wordle.service;

import org.springframework.stereotype.Service;

import com.wordle.data.Client;

@Service
public class SignUpService {

	public boolean verifyUniqueUsername(String username) {		
		return false;
	}
	
	public boolean verifyPasswordCredentials(String password) {
		return true;
	}
	
	public void addClient(Client client) {
		
	}

}
