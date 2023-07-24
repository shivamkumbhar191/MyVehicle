package com.service;

public class EmptyVehicleException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmptyVehicleException() {
		System.out.println("Vehicle list is empty");
	}
	public EmptyVehicleException(String message) {
		super(message);
	}
}
