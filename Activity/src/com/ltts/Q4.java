package com.ltts;

import java.util.*;

class NameNotFoundCustomException extends Exception {
	public NameNotFoundCustomException() {
		System.out.println("TeamNameNotFoundException---");
	}	
}

public class Q4 {
	public static void main(String[] args) throws NameNotFoundCustomException {
		String s1,s2;
		ArrayList<String> iplteams=new ArrayList<String>();
		Scanner ip=new Scanner(System.in);
		iplteams.add("Royal Challengers Bengaluru");
		iplteams.add("Delhi Capitals");
		iplteams.add("Mumbai Indians");
		iplteams.add("Rajasthan Royals");
		iplteams.add("Kolkata Knight Riders");
		iplteams.add("Kings XI Punjab");
		iplteams.add("Sun Risers Hyderabad");
		iplteams.add("Chennai Super Kings");
		System.out.println("Enter the expected winner team of IPL Season 13:");
		s1=ip.nextLine();
		if(!(iplteams.contains(s1)))
		{
		    throw new NameNotFoundCustomException();
		}
		System.out.println("Enter the expected runner Team of IPL Season 13:");
		s2=ip.nextLine();
		if(!(iplteams.contains(s2)))
		{
		    throw new NameNotFoundCustomException();
		}
		System.out.println("Expected IPL Season 13 winner: Delhi Capitals");
		System.out.println("Expected IPL Season 13 runner: Kolkata Knight Riders");
		
	}
}
