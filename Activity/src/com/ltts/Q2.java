package com.ltts;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		int arrsize,runs;
		Scanner ip=new Scanner(System.in);
		try
		{
		    System.out.println("Enter the number of overs:");
		    arrsize=ip.nextInt();
		    
		    int[] arr=new int[arrsize];
		    System.out.println("Enter the number of runs of each over:");
		    for(int i=0;i<arrsize;i++)
		    {
		        arr[i]=ip.nextInt();
		    }
		    
		    System.out.println("Enter the over number:");
		    runs=ip.nextInt();
		    System.out.println("Runs scored in this over:"+arr[runs-1]);
		}
		catch(Exception e)
		{
		    System.out.println(e.getClass());
		}
	}
}
