package com.bharani;

public class Division5_for 
{

	public static void main(String[] args) 
	{
		int no=100;
		int smallest=-1;
		int greatest=-1;
		for(int div=2;div<no;div++)
		{
			if(no%div==0)
			{
				if(smallest==-1)
				{
					smallest=div;
				}
				greatest=div;
				System.out.println(div);
			}
		}
		System.out.println("The smallest divisor is " +smallest);
		System.out.println("The greatest divisor is " +greatest);
	}

}
