package com.ltts;

import java.util.Scanner;

public class VehicleMain {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("1. Four Wheeler \n2. fwo Wheeler");
		String i = ip.next();
		
		switch(i) {
		case "1":
			FourWheeler fw = new FourWheeler(i, i, i, 0, 0, i, 0);
			
			System.out.println("Vehicle Make: ");
			String vhmk = ip.next();
			fw.setMake(vhmk);
			
			System.out.println("Vehicle Number: ");
			String vhnum = ip.next();
			fw.setVehicleNumber(vhnum);
			
			System.out.println("Fuel Type:\n1. Petrol\n2. Diesel");
			String futy = ip.next();
			switch(futy) {
			case "1":
				String ftyp = "Petrol";
				fw.setFuelType(ftyp);
				break;
			case "2":
				String ftyd = "Diesel";
				fw.setFuelType(ftyd);
				break;
			default:
				break;
			}
			
			System.out.println("Fuel Capacity: ");
			int vhfcp = ip.nextInt();
			fw.setFuelCapacity(vhfcp);
			
			System.out.println("Engine CC: ");
			int vhencc = ip.nextInt();
			fw.setCc(vhencc);
			
			System.out.println("Audio System: ");
			String vhaud = ip.next();
			fw.setAudioSystem(vhaud);
			
			System.out.println("Number of doors: ");
			int vhdoor = ip.nextInt();
			fw.setNumberOfDoors(vhdoor);
			
			System.out.println("***"+fw.getMake()+"***");
			System.out.println("---Basic Information---");
			System.out.println("Vehicle Number: "+fw.getVehicleNumber());
			System.out.println("Fuel Capacity: "+fw.getFuelCapacity());
			System.out.println("Fuel Type: "+fw.getFuelType());
			System.out.println("CC: "+fw.getCc());
			System.out.println("---Detail Information---");
			System.out.println("Audio System: "+fw.getAudioSystem());
			System.out.println("Number of Doors: "+fw.getNumberOfDoors());
		
			break;
		case "2":
			TwoWheeler tw = new TwoWheeler(i, i, i, 0, 0, false);
			
			System.out.println("Vehicle Make: ");
			String twmk = ip.next();
			tw.setMake(twmk);
			
			System.out.println("Vehicle Number: ");
			String twnum = ip.next();
			tw.setVehicleNumber(twnum);
			
			System.out.println("Fuel Type:\n1. Petrol\n2. Diesel");
			String twty = ip.next();
			switch(twty) {
			case "1":
				String ftyp = "Petrol";
				tw.setFuelType(ftyp);
				break;
			case "2":
				String ftyd = "Diesel";
				tw.setFuelType(ftyd);
				break;
			default:
				break;
			}
			
			System.out.println("Fuel Capacity: ");
			int twfcp = ip.nextInt();
			tw.setFuelCapacity(twfcp);
			
			System.out.println("Engine CC: ");
			int twencc = ip.nextInt();
			tw.setCc(twencc);
			
			System.out.println("Kick Start Available(yes/no): ");
			String twks = ip.next();
			switch(twks) {
			case "yes":
				tw.setKickStartAvailable(true);
				break;
			case "no":
				tw.setKickStartAvailable(false);
				break;
			default:
				break;
			}
				
			System.out.println("***"+tw.getMake()+"***");
			System.out.println("---Basic Information---");
			System.out.println("Vehicle Number: "+tw.getVehicleNumber());
			System.out.println("Fuel Capacity: "+tw.getFuelCapacity());
			System.out.println("Fuel Type: "+tw.getFuelType());
			System.out.println("CC: "+tw.getCc());
			System.out.println("---Detail Information---");
			System.out.println("Kick Start Available: "+tw.isKickStartAvailable());
			
		default:
			break;
		}
	}
}

