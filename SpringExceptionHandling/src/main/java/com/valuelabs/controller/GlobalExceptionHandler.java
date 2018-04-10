package com.valuelabs.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.valuelabs.exception.DataNotFoundException;
@EnableWebMvc
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DataNotFoundException.class)
	public ModelAndView exceptionHandlerMethod(Exception ex){
		ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", ex);
	   // mav.addObject("EnterId", ex);
	    mav.setViewName("errorPage");
	    return mav;
	}
	

}
