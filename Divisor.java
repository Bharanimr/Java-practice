package com.bharani;

public class Divisor 
{

	public static void main(String[] args) 
	{
		Divisor div = new Divisor();
		div.find_common_divsor(100,120);
	}

	private void find_common_divsor(int no1, int no2) 
	{
		int div=2;
//	    int small = 0; 
//	    if(no1<no2)
//	    {
//	      small = no1; 
//	    }
//	    else
//	    {
//	      small = no2; 
//	    }
		
		int greatest = -1;
	    //Ternary Operator
	    int small = no1<no2? no1:no2; 
	    
		while(div<=small)
		//while(div<=no1 && div<=no2)
		{
			if(no1%div==0 && no2%div==0)
			{
				System.out.println(div+ " is the common divisor");
				greatest = div;
			}
			div=div+1;
		}
		System.out.println("Greatest Divisor is " +greatest);
	}

}
