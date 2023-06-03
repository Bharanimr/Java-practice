package com.bharani;

public class Straight 
{

	public static void main(String[] args) 
	{
		Straight str = new Straight();
		str.straight(1234);
	}
	private void straight(int no) 
	{
	    int div = 1000;
	    while(div>=1)
	    {
	    	System.out.println(no/div+ " ");  
	    	no = no%div; 
	    	div = div/10; 
	    }
	  }

}
