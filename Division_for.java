package com.bharani;

public class Division_for 
{

	public static void main(String[] args) 
	{
		//int no=100;
		int div=2;
		int count=0;
		for(int no=100;div<no;div++)
		{
			if(no%div==0)
			{
			System.out.println("Divisor is " +div);
			count=count+1;
			}
		}
		System.out.println("Count is " +count);
	}

}
