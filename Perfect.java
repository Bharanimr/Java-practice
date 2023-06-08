package com.bharani;

public class Perfect 
{

	public static void main(String[] args) 
	{
		int no = 50;
		Perfect per = new Perfect();
		per.find_perfect_number(no);
	}

	private void find_perfect_number(int no) 
	{
		int sum=0;  
		int div = 1;
		while(div<=no/2)
		{
			int rem = no%div;
			if(rem==0)
			{
				System.out.println(div);
				sum=sum+div;
			}
			div=div+1;
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
