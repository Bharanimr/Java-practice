package com.bharani;

public class Armstrong_for 
{

	public static void main(String[] args) 
	{
		int no=1634;
		int num=no;
		int count=0;
		for(;num>0;count++)
		{
			num=num/10;
		}
		//System.out.println("Count is " +count);
		int total=0;
		for(num=1634;num>0;)
		{
			int rem=num%10;
			//System.out.println(rem);
			int result=find_power(rem,count);
			total=total+result;
//			System.out.println("Total is " +total);
			num=num/10;
		}
		System.out.println("Total is " +total);
		if(total==no)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
	}

	private static int find_power(int rem, int count) 
	{
		int result=1;
		for(;count>0;count--)
		{
			result=result*rem;
			
		}
		return result;
		//System.out.println(result);
		
	}

		
	}


