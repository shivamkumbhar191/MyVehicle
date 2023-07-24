package com.service;

public class ServiceRecord {
	 Vehicle v;
	 String date;
	 String description;
	 double cost;
	public ServiceRecord(Vehicle v, String date, String description, double cost) {
		super();
		this.v = v;
		this.date = date;
		this.description = description;
		this.cost = cost;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "ServiceRecord [v=" + v + ", date=" + date + ", description=" + description + ", cost=" + cost
				+ "]";
	}
	

}
