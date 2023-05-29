package com.bharani;

public class Puzzles 
{

	public static void main(String[] args) 
	{
		Puzzles plan = new Puzzles();
		plan.daughter_plan();
	}
	
	void daughter_plan()
	{
		int day = 1;
		int packet_money = 5;
		int savings = 0;
		
		while(day<=10)
		{
			savings = savings+packet_money;
			day=day+1;
			System.out.println("Daily: " +savings);

		}
		System.out.println("Daughters savings is: " +savings);
	}

}
