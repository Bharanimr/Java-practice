package com.bharani;

public class Divisor_for 
{

	public static void main(String[] args) 
	{
		int no1 = 100;
		int no2 = 120;
		int greatest = -1;
		int count = 0;
		
		//Ternary operator
		int small = no1<no2? no1:no2;
		
		for(int div=2;div<=small;div++)
		{
			if(no1%div==0 && no2%div==0)
			{
				System.out.println(div);
				greatest=div;
				count++;
			}
		}
		System.out.println("Count is " +count);
		System.out.println("The greatest divisor is " +greatest);
	}

}
