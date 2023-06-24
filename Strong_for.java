package com.bharani;

public class Strong_for 
{

	public static void main(String[] args) 
	{
		int no = 145;
		Strong_for str = new Strong_for();
		int sum=str.find_strong_number(no);
		System.out.println(sum);
		if(sum==no)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
	
	private int find_strong_number(int no) 
	{
		int sum=0;
		for(;no>0;)
		{
			int num = no%10;
			//System.out.println(num);
			int fact = find_fact(num);
			//System.out.println(fact);
			sum=sum+fact;
			no=no/10;
		}
		return sum;
		//System.out.println(sum);
		
	}

	private int find_fact(int num) 
	{
		int total = 1;
		//int number = 1;
		for(;num>0;)
		{
			total=total*num;
			num=num-1;
		}
		return total;
	}

}
