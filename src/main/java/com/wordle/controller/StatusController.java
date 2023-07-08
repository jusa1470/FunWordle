package com.wordle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StatusController {

	@RequestMapping(value = "/status", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView getStatus(ModelAndView mav) {
		System.out.println("******GET STATUS*****");
		mav.setViewName("status");
		return mav;
	}

}
