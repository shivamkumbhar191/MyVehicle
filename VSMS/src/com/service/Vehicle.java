package com.service;

public class Vehicle {
	String vehicelNo;
	String vehicleName;
	String modelNo;
	VehicleType vt;
	int year;
	int mileage;
	
	public Vehicle(String vehicelNo, String vehicleName, String modelNo, VehicleType vt, int year, int mileage) {
		super();
		this.vehicelNo = vehicelNo;
		this.vehicleName = vehicleName;
		this.modelNo = modelNo;
		this.vt = vt;
		this.year = year;
		this.mileage = mileage;
	}
	public String getVehicelNo() {
		return vehicelNo;
	}
	public void setVehicelNo(String vehicelNo) {
		this.vehicelNo = vehicelNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public VehicleType getVt() {
		return vt;
	}
	public void setVt(VehicleType vt) {
		this.vt = vt;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicelNo=" + vehicelNo + ", vehicleName=" + vehicleName + ", modelNo=" + modelNo + ", vt="
				+ vt + ", year=" + year + ", mileage=" + mileage + "]";
	}
	
	

}
