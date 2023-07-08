package com.wordle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wordle.data.Client;
import com.wordle.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("client", new Client());
	    return mav;
	}
	
	@RequestMapping(value = "/processlogin", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("client") Client client) {
		ModelAndView mav = new ModelAndView();
		
		if (!loginService.validateUser(client)) {
			mav.setViewName("login");
			mav.addObject("errorMessage", "Error: Invalid Credentials");
		} else {
			mav.setViewName("wordle");
			mav.addObject("firstName", client.getFirstName());
		}

		return mav;
	}

}
