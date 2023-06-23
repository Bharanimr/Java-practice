package com.bharani;

public class Straight2_for 
{

	public static void main(String[] args) 
	{
		Straight2_for str = new Straight2_for();
		str.straight(123456);
		str.straight2(123456);
	}
	private void straight(int no) 
	{
	    
	    for(int div=10000;div>=1;)
	    {
	    	System.out.println(no/div);  
	    	no = no%div; 
	    	div = div/100; 
	    }
	  }
	private void straight2(int num) 
	{
	   
	    for(int div=1000;div>=1;)
	    {
	    	System.out.println(num/div);  
	    	num = num%div; 
	    	div = div/1000; 
	    }
	  }

}
