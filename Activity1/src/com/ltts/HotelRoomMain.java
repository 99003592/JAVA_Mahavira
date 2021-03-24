package com.ltts;

import java.util.Scanner;

public class HotelRoomMain {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room");
		System.out.println("Select Room Type: ");
		int selection = ip.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Hotel Name: ");
			String htname = ip.next();
			System.out.println("Room Sqaure Feet Area: ");
			int sqft = ip.nextInt();
			System.out.println("Room has TV (yes/no): ");
			String tv = ip.next();
			System.out.println("Room has Wifi (yes/no): ");
			String wifi = ip.next();
			
			DeluxeRoom dr = new DeluxeRoom(wifi, sqft, false, false, sqft);
			
			dr.setNumberOfSqFeet(sqft);
			
			if (wifi.equals("yes")) {
				dr.setHasWifi(true);
			} else {
				dr.setHasWifi(false);
			}
			
			int totalTariff = dr.calculateTariff(dr.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+totalTariff);
			break;
		case 2:
			System.out.println("Hotel Name: ");
			String htname1 = ip.next();
			System.out.println("Room Square Feet Area: ");
			int sqft1 = ip.nextInt();
			System.out.println("Room has TV (yes/no): ");
			String tv1 = ip.next();
			System.out.println("Room has wifi (yes/no): ");
			String wifi1 = ip.next();
			
			DeluxACRoom drac = new DeluxACRoom(htname1, sqft1, false, false, sqft1, sqft1);
			
			drac.setNumberOfSqFeet(sqft1);
			
			if(wifi1.equals("yes")) {
				drac.setHasWifi(true);
			} else {
				drac.setHasWifi(false);
			}
			
			int totalTariff1 = drac.calculateTariff(drac.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+totalTariff1);
			break;
		case 3:
			System.out.println("Hotel Name: ");
			String htname2 = ip.next();
			System.out.println("Room Square Feet Area: ");
			int sqft2 = ip.nextInt();
			System.out.println("Room has TV (yes/no): ");
			String tv2 = ip.next();
			System.out.println("Room has wifi (yes/no): ");
			String wifi2 = ip.next();
			
			SuiteACRoom sacr = new SuiteACRoom(htname2, sqft2, false, false, sqft2);
			
			sacr.setNumberOfSqFeet(sqft2);
			
			if(wifi2.equals("yes")){
				sacr.setHasWifi(true);
			} else {
				sacr.setHasWifi(false);
			}
			
			int totalTariff2 = sacr.calculateTariff(sacr.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+totalTariff2);
		default:
			break;
		}
	}
}
