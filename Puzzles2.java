package com.bharani;

public class Puzzles2 
{

	public static void main(String[] args) 
	{
		Puzzles2 plan = new Puzzles2();
		plan.father_plan();
	}
	void father_plan()
	{
		int day = 1;
		int savings = 0;
		
		while(day<=10)
			{
				savings = savings+day;
				day = day+1;
				System.out.println("Daily:" +savings);
			}
		System.out.println("Total Savings is:" +savings);
	}

}
