package com.ltts;

import java.util.*;

class CustomException extends Exception {
	CustomException() {
		System.out.println("CustomException: InvalidAgeRangeException");
	}
}

public class Q3 {
	public static void main(String[] args) throws CustomException {
		String name;
		int page;
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the player name:");
		name=ip.nextLine();
		
		System.out.println("Enter the player age:");
		page=ip.nextInt();
		
		if(page<19)
		{
		    throw new CustomException();
		}
		else
		{
		   System.out.println("Player name:"+name);
		   System.out.println("Player age:"+page); 
		}
	}
}
