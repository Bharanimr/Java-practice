package com.bharani;

public class Division4 
{

	public static void main(String[] args) 
	{
		Division4 div=new Division4();
	    div.find_smallest_divisor(49);
	}

	private void find_smallest_divisor(int no) 
	{
		int div = 2; 
	    int smallest = -1; 
	    while(div<=no/2)
	    	{
	        if(no%div==0)
	        	{
	            	smallest = div; 
	            	break; 
	        	}
	          	div = div+1; 
	        }
	        System.out.println("The smallest divisor is "+ smallest);  
	 }
}


