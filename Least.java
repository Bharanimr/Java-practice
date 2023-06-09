package com.bharani;

public class Least 
{

	public static void main(String[] args) 
	{
		Least lcm = new Least();
		lcm.find_lcm(3,9);
	}

	private void find_lcm(int no1,int no2) 
	{
		int big =no1>no2?no1:no2;
		System.out.println(big);
		if(big%no1==0 && big%no2==0)
		{
			System.out.println("LCM is " +big);
		}
		
				
	}

}
