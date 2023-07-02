package com.wordle.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;

public class FunWordleAppConfiguration {

	@Autowired
	private ErrorAttributes errorAttributes;

	public FunWordleAppConfiguration(ErrorAttributes errorAttributes) {
		this.errorAttributes = errorAttributes;
	}

	@Bean
	public FunWordleAppConfiguration appErrorController(){return new FunWordleAppConfiguration(errorAttributes);}

}
