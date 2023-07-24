package com.main;

import java.util.Scanner;

import com.controller.VehicleController;

public class VehicleServiceManagementSystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		VehicleController vc= new VehicleController();
		char ch;
		do {
			System.out.println("Welcome to Vehicle Management Service System");
			System.out.println("enter the choice");
			System.out.println("1.Add Vehicle\n2.Remove Vehicle\n3.Display all vehicle\n4.search by vehicle name"
					+ "\n5.search by model\n6.Search by Vehicle Type\n7.Add service record\n8.Disaply All service history ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: vc.vehicleOperations(choice);
			break;
			case 2: vc.vehicleOperations(choice);
			break;
			case 3: vc.vehicleOperations(choice);
			break;
			case 4: vc.vehicleOperations(choice);
			break;
			case 5: vc.vehicleOperations(choice);
			break;
			case 6: vc.vehicleOperations(choice);
			break;
			case 7: vc.vehicleOperations(choice);
			break;
			case 8: vc.vehicleOperations(choice);
			break;
			default :System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);
		}while(ch=='y' ||ch=='Y');
		sc.close();

	}

}
