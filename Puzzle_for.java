package com.bharani;

public class Puzzle_for 
{

	public static void main(String[] args) 
	{
		Puzzle_for plan = new Puzzle_for();
		plan.daughter_plan();
	}
	void daughter_plan()
	{
		
		int packet_money = 5;
		int savings = 0;
		
		for(int day=1;day<=10;day++)
		{
			savings = savings+packet_money;
			
			System.out.println("Daily: " +savings);

		}
		System.out.println("Daughters savings is: " +savings);
	}

}
