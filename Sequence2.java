package com.bharani;

public class Sequence2 
{

	public static void main(String[] args) 
	{
		int no = 1; 
		while(no<=60)
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
		
