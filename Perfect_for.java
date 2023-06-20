package com.bharani;

public class Perfect_for 
{

	public static void main(String[] args)
	{
		int no = 28;
		Perfect_for per = new Perfect_for();
		per.find_perfect_number(no);
	}
	private void find_perfect_number(int no) 
	{
		int sum=0;  
		
		for(int div=1;div<=no/2;div++)
		{
			int rem = no%div;
			if(rem==0)
			{
				System.out.println(div);
				sum=sum+div;
			}
		}
		System.out.println("Sum of " +sum);
		
		
	if(no==sum)
	{
		System.out.println("It is a Perfect Number");
	}
	else
	{
		System.out.println("It is Not a Perfect Number");
	}
	}

}
