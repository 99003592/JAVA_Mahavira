package com.ltts;

import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		float ar, ao;
		String str, stro;
		Scanner ip = new Scanner(System.in);
		try {
			System.out.println("Enter the runs scored: ");
			str = ip.next();
			ar = Integer.parseInt(str);
			
			System.out.println("Enter the total overs faced: ");
			stro = ip.next();
			ao = Integer.parseInt(stro);
			
			float runr = ar/ao;
			System.out.printf("Current Run RateL %.2f",runr);
		} catch (Exception e) {
			
			System.out.println(e.getClass());
		}
	}
}
