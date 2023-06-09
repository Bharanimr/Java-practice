package com.bharani;

public class Swapping2 
{

	public static void main(String[] args) 
	{
		Swapping2 sw = new Swapping2();
		sw.swap_water(123,234);
	}

	private void swap_water(int no1, int no2) 
	{
		System.out.println("No1 " +no1);
		System.out.println("No2 " +no2);
		no1 = no1 + no2; 
	    System.out.println("No1 " + no1);
	    no2 = no1 - no2; 
	    System.out.println("No2 " + no2);
	    no1 = no1 - no2; 
	    System.out.println("No1 " + no1);
	}

}
