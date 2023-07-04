package com.wordle.controller;

import javax.crypto.Mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wordle.data.Client;
import com.wordle.service.LoginService;
import com.wordle.service.SignUpService;

import jakarta.servlet.annotation.WebServlet;

@Controller
@RequestMapping("/")
public class LoginController {
		
	@Autowired
	private LoginService loginService;
	@Autowired
	private SignUpService signUpService;

	@RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView showLoginPage(Client client){
		System.out.println("******MAIN*******");
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Client());

		return mav;
    }
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("client") Client client){
		System.out.println("******LOGIN*******");
		ModelAndView mav = new ModelAndView();

		if (!loginService.validateUser(client)) {
			mav.setViewName("forward:/status");
			mav.addObject("statusMessage", "Error: Invalid Credentials");
		}
		else {
			mav.setViewName("wordle");
			mav.addObject("firstName", client.getFirstName());
		}

        return mav;
    }
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
    public ModelAndView signUp(@ModelAttribute Client client){
		System.out.println("****SIGNUP*****");
		ModelAndView mav = new ModelAndView();

		if (!signUpService.verifyUniqueUsername(client.getUsername())) {
			mav.setViewName("forward:/status");
			mav.addObject("statusMessage", "Error: Username already taken");
		}
		else if (!signUpService.verifyPasswordCredentials(client.getPassword())) {
			String errorMessage = "Error: Password must include the following:\n" +
					"At least one uppercase character\n" +
					"At least one lowercase character\n" +
					"At least one number";
			mav.setViewName("forward:/status");
			mav.addObject("statusMessage", errorMessage);
		}
		else {
			signUpService.addClient(client);
			mav.setViewName("wordle");
			mav.addObject("statusMessage", "Signup successful!");
		}

        return mav;
    }

}
