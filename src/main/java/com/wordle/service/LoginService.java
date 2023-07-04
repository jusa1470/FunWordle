package com.wordle.service;

import org.springframework.stereotype.Service;

import com.wordle.data.Client;

@Service
public class LoginService {

	public boolean validateUser(Client client) {		
		return true;
	}

}
