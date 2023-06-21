package com.bharani;

public class Puzzle2_for 
{

	public static void main(String[] args) 
	{
		Puzzle2_for plan = new Puzzle2_for();
		plan.father_plan();
	}
	void father_plan()
	{
	
		int savings = 0;
		
		for(int day=1;day<=10;day++)
			{
				savings = savings+day;
				
				System.out.println("Daily:" +savings);
			}
		System.out.println("Total Savings is:" +savings);
	}


}
