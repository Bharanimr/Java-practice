package com.bharani;

public class Division3 
{

	public static void main(String[] args) 
	{
		Division3 div =new Division3();
		div.find_greatest_divisor(100);
	}

	private void find_greatest_divisor(int no) 
	{
		 int div = 2; 
		 int greatest = -1; 
		 while(div<=no/2)
		 {
			 if(no%div==0)
		     {
				 greatest = div; 
		     }
		     div = div+1; 
		 }
		 System.out.println("Greatest Divisor is "+ greatest);
		    
	}
	

}
