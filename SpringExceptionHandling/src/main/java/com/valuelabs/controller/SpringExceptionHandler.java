package com.valuelabs.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.valuelabs.exception.DataNotFoundException;

@Controller
public class SpringExceptionHandler {
	
	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	@ExceptionHandler({DataNotFoundException.class,Exception.class})
	public void getData(@RequestParam int EnterId/*, Model model*/) throws Exception {
		if (EnterId == 1) {
			throw new DataNotFoundException(EnterId);
			//throw new SQLException("sdjjfhskdfk");
		}
		else{
			throw new Exception();
			//System.out.println("success");
		}
		//model.addAttribute(EnterId);
		//System.out.println("scjdh");
		//return "errorPage";
	}
	/*@ExceptionHandler(DataNotFoundException.class)
	public ModelAndView exceptionHandlerMethod(Exception ex){
		ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", ex);
	   // mav.addObject("EnterId", ex);
	    mav.setViewName("errorPage");
	    return mav;
	}*/
}
