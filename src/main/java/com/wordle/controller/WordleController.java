package com.wordle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WordleController {

	@RequestMapping(value = "/wordle", method = RequestMethod.GET)
	public ModelAndView wordle() {
		ModelAndView mav = new ModelAndView("wordle");
	    return mav;
	}

}
