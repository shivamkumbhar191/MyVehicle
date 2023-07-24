package com.service;

public class NotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotFoundException() {
		System.out.println("Vehicle not found");
	}
	public NotFoundException(String message) {
		super(message);
	}
	
}
