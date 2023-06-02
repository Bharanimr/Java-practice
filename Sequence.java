package com.bharani;

public class Sequence 
{

	public static void main(String[] args) 
	{
		int no = 1; 
		while(no<=10)        
		{
		    System.out.print(no+" "); 
		    if(no==9)
		        {
		        	no = 0; 
		        }
		    no+=2; 
		}
	}

}
