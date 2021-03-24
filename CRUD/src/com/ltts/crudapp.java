package com.ltts;

import java.util.*;

public class crudapp {
	static HashMap<Integer,String> i = new HashMap<Integer,String>();
	static Scanner ip = new Scanner(System.in);
	
	static int key;
	static String value;
	
	static void createapp() {
		System.out.println("Enter key: ");
		key = ip.nextInt();
		System.out.println("Enter value: ");
		value = ip.next();
		i.put(key, value);
		System.out.println("Created successfully.");
	}
	
	static void readapp() {
		System.out.println("Key -> Value");
		for(Map.Entry m : i.entrySet()) {
			System.out.println(m.getKey()+" -> "+m.getValue());
		}
	}
	
	static void updateapp() {
		System.out.println("Current HashMap");
		readapp();
		System.out.println("Enter the key to update");
		key = ip.nextInt();
		if(i.containsKey(key)) {
			System.out.println("Enter the value to update");
			value = ip.next();
			i.put(key, value);
			System.out.println("Updated successfully");
		}
		else {
			System.out.println("Specified key is not present.");
		}
	}
	
	static void deleteapp() {
		System.out.println("Current HashMap");
		readapp();
		System.out.println("Enter the key to delete");
		key=ip.nextInt();
		i.remove(key);
		System.out.println("Deleted successfully");
	}
	
	public static void main(String[] args) {
		int inputch = 0;
		System.out.println("--CRUD application--");
		while(inputch!=5) {
			System.out.println("--MENU--");
			System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \n5.Exit");
			System.out.println("Enter your choice: ");
			inputch = ip.nextInt();
			
			switch(inputch) {
			case 1: System.out.println("--Create--");
					createapp();
					break;
			case 2: System.out.println("--Read--");
			 		readapp();
			 		break;
			case 3: System.out.println("--Update--");
					updateapp();
					break;
			case 4: System.out.println("--Delete--");
					deleteapp();
					break;
			case 5: System.out.println("Exit");
					break;
			default: System.out.println("Invalid choice..");
			}
		}
	}
	
	
}
