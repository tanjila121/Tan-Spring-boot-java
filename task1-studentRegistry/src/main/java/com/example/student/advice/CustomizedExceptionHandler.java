package com.example.student.advice;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request){
		  ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
			        request.getDescription(false));
		    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
			  }

			@ExceptionHandler(NoSuchElementFoundException.class)
			 public final ResponseEntity<ExceptionResponse> 
			handleUserNotFoundException(NoSuchElementFoundException notfound, WebRequest request) {
				    ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), notfound.getMessage(),
					        request.getDescription(false));
				    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	 }
}
//@RestControllerAdvice
//public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
//
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
//		Map<String, String> errorMap=new HashMap<>();
//		ex.getBindingResult().getFieldErrors().forEach(error ->{
//			errorMap.put(error.getField(), error.getDefaultMessage());
//		});
//		return errorMap;
//	