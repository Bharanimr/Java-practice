package com.bharani;

public class Reverse 
{

	public static void main(String[] args) 
	{
		Reverse rev = new Reverse();
		rev.print_reverse(1234);
		rev.sum_of_digits(1234);
	}
	private void sum_of_digits(int no) 
	{
		int sum = 0;
		while(no>0)
		{
			int rem = no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum of the " +sum);
	}
	private void print_reverse(int cake) 
	{
		int count=0;
	    while(cake>0)
	    {
	      System.out.println(cake%10);
	      
	      cake = cake/10; 
	      count=count+1;
	    }
	    System.out.println("Count is " +count);
	  }

}
