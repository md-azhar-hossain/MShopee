package com.cg.mobshop.exception;

public class MobileException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public MobileException(String message)
	{ super(message);
		this.message = message;
	}

}
