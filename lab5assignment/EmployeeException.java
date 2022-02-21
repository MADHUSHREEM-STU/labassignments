package com.cg.eis.exception;

public class EmployeeException extends Exception{
	private String message;
	EmployeeException(String message)
	{
		this.message=message;
	}
	public String getMessage(){
		return this.message;
	}

}
