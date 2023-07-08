package com.wordle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wordle.data.Client;
import com.wordle.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("client", new Client());
	    return mav;
	}
	
	@RequestMapping(value = "/processregister", method = RequestMethod.POST)
	public ModelAndView processRegister(@ModelAttribute("client") Client client) {
		ModelAndView mav = new ModelAndView();

		if (!registerService.verifyUniqueUsername(client.getUsername())) {
			mav.setViewName("register");
			mav.addObject("errorMessage", "Error: Username already taken");
		} else if (!registerService.verifyPasswordCredentials(client.getPassword())) {
			String errorMessage = "Error: Password must include the following:\n" + "At least one uppercase character\n"
					+ "At least one lowercase character\n" + "At least one number";
			mav.setViewName("register");
			mav.addObject("errorMessage", errorMessage);
		} else {
			registerService.addClient(client);
			mav.setViewName("login");
			mav.addObject("successMessage", "Registration successful! Please login");
		}

		return mav;
	}

}
