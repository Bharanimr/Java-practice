package com.bharani;

public class Least2 
{

	public static void main(String[] args) 
	{
		Least2 lcm = new Least2();
		lcm.find_lcm(3001,50);
	}

	private void find_lcm(int no1, int no2) 
	{
		int big =no1>no2?no1:no2;
		int temp = big;
		System.out.println(big);
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println("LCM is " +big);
				break;
			}
		big = big+temp;
		}
	}

}
