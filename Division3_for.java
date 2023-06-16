package com.bharani;

public class Division3_for 
{

	public static void main(String[] args) 
	{
		Division3_for div =new Division3_for();
		div.find_greatest_divisor(100);
	}

	private void find_greatest_divisor(int no) 
	{
		 int greatest = -1; 
		 for(int div=2;div<no;div++)
		 {
			 if(no%div==0)
		     {
				 greatest = div; 
		     }
		 }
		 System.out.println("Greatest Divisor is "+ greatest);
		    
	}

}
