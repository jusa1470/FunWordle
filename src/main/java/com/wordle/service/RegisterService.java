package com.wordle.service;

import org.springframework.stereotype.Service;

import com.wordle.data.Client;

@Service
public class RegisterService {

	public boolean verifyUniqueUsername(String username) {
		return true;
	}

	public boolean verifyPasswordCredentials(String password) {
		return false;
	}

	public void addClient(Client client) {

	}

}
