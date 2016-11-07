package it.alfasoft.vahid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GestoreEccezioni {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
    public String gestireEccezioni(Exception ex){
    	
    	// logging 
    	
    	
    	return "ErrorPage";
    }
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
    public String gestireEccezioni2(Exception ex){
    	
    	// logging 
    	
		System.out.println("invocato nul pointer handeler"+ex.getMessage());
    	
    	return "ErrorPage";
    }
}
