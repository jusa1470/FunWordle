package com.wordle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.wordle.data.Client;
import com.wordle.service.LoginService;
import com.wordle.service.SignUpService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@Autowired
	private SignUpService signUpService;

	@GetMapping(value="/")
    public String showLoginPage(){
		System.out.println("******MAIN*******");
        return "login";
    }
	
	@PostMapping(value="/login")
    public String login(ModelMap model, Client client){

		if (!loginService.validateUser(client)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

        model.put("username", client.getUsername());

        return "wordle";
    }
	
	@PostMapping(value="/signup")
    public String signUp(ModelMap model, Client client){
		System.out.println("****GOT HERE*****");

		if (!signUpService.verifyUniqueUsername(client.getUsername())) {
			model.put("errorMessage", "Username already taken");
		}
		else if (!signUpService.verifyPasswordCredentials(client.getPassword())) {
			String errorMessage = "Password must include the following:\n" +
					"At least one uppercase character\n" +
					"At least one lowercase character\n" +
					"At least one number";
			model.put("errorMessage", errorMessage);
		}
		else {
			signUpService.addClient(client);
			model.put("signUpStatus", "Signup successful!");
		}

        return "login";
    }

}
