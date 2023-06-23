package com.bharani;

public class Straight_for 
{

	public static void main(String[] args) 
	{
		Straight_for str = new Straight_for();
		str.straight(1234);
	}
	private void straight(int no) 
	{
	    
	    for(int div=1000;div>=1;)
	    {
	    	System.out.println(no/div);  
	    	no = no%div; 
	    	div = div/10; 
	    }
	 }

}
