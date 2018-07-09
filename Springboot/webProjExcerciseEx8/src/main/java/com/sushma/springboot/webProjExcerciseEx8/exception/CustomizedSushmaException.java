package com.sushma.springboot.webProjExcerciseEx8.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomizedSushmaException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllException(ParentException ex, WebRequest request) throws Exception{
		ExceptionResponse response = new ExceptionResponse(ex.getErrorId(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<ExceptionResponse>(response,  HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(ParentException ex, WebRequest request) throws Exception{
		ExceptionResponse response = new ExceptionResponse(ex.getErrorId(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<ExceptionResponse>(response,  HttpStatus.NOT_FOUND);
	}
}
