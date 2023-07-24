package com.service;

public class VehicleType {
	String VehicleType;

	public VehicleType(String vehicleType) {
		super();
		VehicleType = vehicleType;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "VehicleType [VehicleType=" + VehicleType + "]";
	}

}
