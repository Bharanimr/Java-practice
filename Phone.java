package com.bharani;

public class Phone 
{
	public static void main(String[] args) 
	{
	    long number=9973556781L;
	    int num=(int)(number/100000000L);
	    System.out.println(num);
	    numberCheck(num);
	}

	private static void numberCheck(int num)
	{
	    if(num==91)
	      System.out.println("Docomo");
	    else if(num==94)
	      System.out.println("BSNL");
	    else if(num==96)
	      System.out.println("Aircel");
	    else if(num==99)
	      System.out.println("Airtel");
	    else if(num==63)
	      System.out.println("JIO");
	    else if(num==97)
	      System.out.println("IDEA");
	    else if(num==98)
	      System.out.println("Vodafone");
	    else 
	      System.out.println("cannot found ");
	 }
}

	
