package com.valuelabs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND , reason="Data is Not Found")
public class DataNotFoundException extends Exception {
	
	public DataNotFoundException(int EnterId){
		
		System.out.println("data not found with:"+EnterId);
		
	}
}
