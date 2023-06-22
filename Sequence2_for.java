package com.bharani;

public class Sequence2_for 
{

	public static void main(String[] args) 
	{
		
		for(int no=1;no<=60;)
		{
		System.out.print(no+" "); 
		if(no==5)
		    {
		    no = 12; 
		    continue; 
		    }
		if(no<=5)
		    {
		    no=no+1; 
		    }
		else
		    {
		    no = no+12; 
		    }
		}
	}

}
