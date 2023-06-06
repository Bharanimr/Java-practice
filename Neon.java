package com.bharani;

public class Neon 
{

	public static void main(String[] args) 
	{
		  int no=9;
		  int res=0;
		  int rem=no*no;
		  System.out.println(rem);
		  while(rem>0)
		  {
			  int no2=rem%10;
		      res=no2+res;
		      rem=rem/10;  
		  }
		  System.out.println(res);
		  if(res==no)
		  {
			  System.out.println(no+ " is a Neon number");
		  }
		  else
		  {
			  System.out.println(no+ " is not a Neon number");
		  }
	}

}


