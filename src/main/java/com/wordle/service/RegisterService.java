package com.wordle.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordle.data.Client;
import com.wordle.data.ClientRepository;

@Service
public class RegisterService {

	@Autowired
	private ClientRepository clientRepository;
	
	public boolean verifyUniqueUsername(String username) {
		return (clientRepository.findByUsername(username).size() == 0);
	}

	public boolean verifyPasswordCredentials(String password) {
		String regex = "^(?=.*[0-9a-zA-Z]).{1,}$";
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        System.out.println(pattern);
        System.out.println(password);
        System.out.println(matcher.matches());
        return matcher.matches();
	}

	public void addClient(Client client) {
		// TODO: Add password security
		clientRepository.save(client);
	}

}
