package com.bharani;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		Armstrong arm = new Armstrong();
		int no = 153;
		int result = arm.armstrong_number(no);
		System.out.println("The number is " +result);
		if(result == no)
		{
			System.out.println("It is an Armstrong");
		}
		else
		{
			System.out.println("It is not a Armstrong");
		}
	}

	private int armstrong_number(int no) 
	{
		int arm=0;
		//double d = Math.pow(no,arm);
		while(no>no/2)
		{
			int num = no%10;
			System.out.println(num);
			arm = arm+(int)Math.pow(num,3);
			//System.out.println(arm);
			no=no/10;
		}
		return arm;
		//System.out.println("The given number is "+arm);
	}
}
	


