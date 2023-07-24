package com.controller;

import com.service.EmptyVehicleException;
import com.service.NotFoundException;
import com.serviceimplementation.VehicleImplementation;

public class VehicleController {
	VehicleImplementation vi=new VehicleImplementation();

	public void vehicleOperations(int choice) {
		switch(choice) {
		case 1: vi.addVehicle();
		break;
		case 2:
			try {
				vi.removeVehicle();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
		break;
		case 3:
			try {
				vi.displayAllVehicle();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
			
		break;
		case 4:
			try {
				vi.searchByVehicleName();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
		break;
		case 5:
			try {
				vi.searchByModel();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
		break;
		case 6:
			try {
				vi.searchByVehicleType();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
		break;
		case 7:
			try {
				vi.addServiceRecord();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
		break;
		case 8:
			try {
				vi.displayServiceHistory();
			}catch(NotFoundException nf){
				nf.getMessage();
			}catch(EmptyVehicleException ev) {
				ev.getMessage();
			}
		break;
		default:System.out.println("Invalid choice");
		}

	}

}
