package com.bharani;

public class Straight2 
{

	public static void main(String[] args) 
	{
		Straight2 str = new Straight2();
		str.straight(123456);
		str.straight2(123456);
	}
	private void straight(int no) 
	{
	    int div = 10000;
	    while(div>=1)
	    {
	    	System.out.println(no/div);  
	    	no = no%div; 
	    	div = div/100; 
	    }
	  }
	private void straight2(int num) 
	{
	    int div = 1000;
	    while(div>=1)
	    {
	    	System.out.println(num/div);  
	    	num = num%div; 
	    	div = div/1000; 
	    }
	  }

}
