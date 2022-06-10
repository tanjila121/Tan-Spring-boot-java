package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchElementFoundException extends RuntimeException {
	
	
	public NoSuchElementFoundException(String exception) {
		super(exception);
	}

}
