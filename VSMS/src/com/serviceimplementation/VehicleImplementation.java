package com.serviceimplementation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.service.EmptyVehicleException;
import com.service.NotFoundException;
import com.service.ServiceRecord;
import com.service.Vehicle;
import com.service.VehicleServiceManager;
import com.service.VehicleType;

public class VehicleImplementation implements VehicleServiceManager {
	Map<Integer,List<Vehicle>> m=new HashMap<>();
	List<Vehicle> al=new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	List<ServiceRecord> sr= new ArrayList<>();

	@Override
	public void addVehicle() {
		System.out.println("enter the number of vehicle you want add");
		int size= sc.nextInt();
		for(int i=1;i<=size;i++) {
			System.out.println("enter the vehicle number");
			String vehicleNo=sc.next();
			System.out.println("enter the vehicle name");
			String vehicleName=sc.next();
			System.out.println("enter the vehicle Model");
			String modelNo=sc.next();
			System.out.println("enter the vehicle type");
			String vehicleType=sc.next();
			System.out.println("enter the vehicle manufacturing year");
			int year= sc.nextInt();
			System.out.println("enter the vehicle mileage");
			int mileage= sc.nextInt();
			al.add(new Vehicle(vehicleNo,vehicleName,modelNo,new VehicleType(vehicleType),year,mileage));
			
		}
		
	}

	@Override
	public void removeVehicle() {
		boolean ispresent=false;
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			System.out.println("enter the vehicle no");
			String vehicleNo= sc.next();
			for(int i=0;i<al.size();i++) {
				if(al.get(i).getVehicelNo().equals(vehicleNo)) {
					ispresent=true;
					al.remove(i);
					System.out.println("Vehicle removed Successfully...");
				}
			}
		}
		if(ispresent==false) {
			throw new NotFoundException();
		}
		
	}

	@Override
	public void displayAllVehicle() {
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
			}
		}
		
	}

	@Override
	public void searchByVehicleName() {
		boolean ispresent=false;
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			System.out.println("enter the vehicle name");
			String vname=sc.next();
			for(int i=0;i<al.size();i++) {
				if(al.get(i).getVehicleName().contains(vname)) {
					ispresent=true;
					System.out.println(al.get(i));
				}
			}
		}
		if(ispresent==false) {
			throw new NotFoundException();
		}
		
		
	}

	@Override
	public void searchByModel() {
		
		boolean ispresent=false;
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			System.out.println("enter the vehicle model");
			String vmodel=sc.next();
			for(int i=0;i<al.size();i++) {
				if(al.get(i).getModelNo().contains(vmodel)) {
					ispresent=true;
					System.out.println(al.get(i));
				}
			}
		}
		if(ispresent==false) {
			throw new NotFoundException();
		}
		
	}

	@Override
	public void searchByVehicleType() {
		
		boolean ispresent=false;
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			System.out.println("enter the vehicle Type");
			String vtype=sc.next();
			for(int i=0;i<al.size();i++) {
				if(al.get(i).getVt().getVehicleType().contains(vtype)) {
					ispresent=true;
					System.out.println(al.get(i));
				}
			}
		}
		if(ispresent==false) {
			throw new NotFoundException();
		}
		
	}

	@Override
	public void addServiceRecord() {
		boolean ispresent=false;
		String vno;
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			System.out.println("enter the vehicle number");
			vno=sc.next();
			for(int i=0;i<al.size();i++) {
				if(al.get(i).getVehicelNo().contains(vno)){
					ispresent=true;					
				}
			}	
		}		
		if(ispresent==true) {
			System.out.println("enter the date");
			String sdate=sc.next();
			System.out.println("enter the decription");
			String desc= sc.next();
			System.out.println("enter the servicing cost");
			double scost= sc.nextDouble();
			for(int i=0;i<al.size();i++) {
						sr.add(new ServiceRecord(new Vehicle(al.get(i).getVehicelNo(), al.get(i).getVehicleName(), 
								al.get(i).getModelNo(),new VehicleType(al.get(i).getVt().getVehicleType()), 
								al.get(i).getYear(), al.get(i).getMileage()),sdate,desc,scost));

			}
		}
		else {
			throw new NotFoundException();
		}
		System.out.println("Service Record Successfully added...");
	}

	@Override
	public void displayServiceHistory() {
		boolean ispresent=false;
		if(al.isEmpty()) {
			throw new EmptyVehicleException();
		}else {
			System.out.println("enter the vehicle number");
			String vno=sc.next();
			for(int i=0;i<sr.size();i++) {
				if(sr.get(i).getV().getVehicelNo().equals(vno)) {
					ispresent=true;
					System.out.println("vehical no= "+sr.get(i).getV().getVehicelNo()+" "+"vehical name= "
					+sr.get(i).getV().getVehicleName()+" "+"service date= "+sr.get(i).getDate()+" "+"service desciption= "
					+sr.get(i).getDescription()+" "+"servicing cost= "+sr.get(i).getCost());
					}	
			}
		}
		if(ispresent==false) {
			throw new NotFoundException();
		}
				
	}

}
