package com.bharani;

public class Division5 
{

	public static void main(String[] args) 
	{
		Division5 div = new Division5();
		div.greatest_smallest(100);
	}

	private void greatest_smallest(int no) 
	{
		int div = 2; 
	    int smallest = -1; 
	    int largest = -1; 
	    while(div<=no/2)
	    {
	      if(no%div==0)
	      {
	        if(smallest==-1)
	            {
	        	smallest = div;
	        	}
	        largest = div;
	      }
	      div = div+1; 
	    }
	    System.out.println("Smallest divisor is "+ smallest);
	    System.out.println("Greatest divisor is "+ largest); 
	}

}
