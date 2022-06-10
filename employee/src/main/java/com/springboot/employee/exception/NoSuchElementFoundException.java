package com.springboot.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchElementFoundException extends RuntimeException {
	
	
	public NoSuchElementFoundException(String exception) {
		super(exception);
	}

}
