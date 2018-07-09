package com.sushma.springboot.webProjValidation9.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleException(ParentException ex, WebRequest request) throws Exception{
		ExceptionResponse response = new ExceptionResponse(ex.getErrorId(), ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(InvalidParametersException.class)
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionResponse response = new ExceptionResponse("E30002", ex.getMessage(), ex.getBindingResult().toString());
		
		return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
	}
}
