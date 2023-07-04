package com.wordle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StatusController {

	@RequestMapping(value="/status", method=RequestMethod.GET)
	public ModelAndView status() {
		System.out.println("******STATUS*****");
		return new ModelAndView("status");
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(HttpServletRequest req, Exception ex) {	
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("exception", ex);
		mav.addObject("url", req.getRequestURL());
	    return mav;
	}

}
