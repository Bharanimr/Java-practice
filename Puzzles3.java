package com.bharani;

public class Puzzles3 
{

	public static void main(String[] args) 
	{
		Puzzles3 plan = new Puzzles3();
		plan.minister();
	}

	private void minister() 
	{
		int day = 1;
		double amount = 1;
		double total = 0;
		
		while(day<=64)
		{
			System.out.println("In day" +day+ ": " +amount);
			total=total+amount;
			amount=amount*2;
			day=day+1;
		}
		System.out.println("Total value is " +total);
		
	}

}
