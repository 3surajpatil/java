package org.samsung.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InvalidUserException extends RuntimeException{

	
	public InvalidUserException(String message)
	{
		super(message);
	}
	
}
