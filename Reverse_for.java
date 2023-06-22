package com.bharani;

public class Reverse_for 
{

	public static void main(String[] args) 
	{
		Reverse_for rev = new Reverse_for();
		rev.print_reverse(1234);
		rev.sum_of_digits(1234);
	}
	private void print_reverse(int cake) 
	{
		int count=0;
	    for(;cake>0;cake=cake/10)
	    {
	      System.out.println(cake%10);
	      
	     
	      count=count+1;
	    }
	    System.out.println("Count is " +count);
	  }
	private void sum_of_digits(int no) 
	{
		int sum = 0;
		for(;no>0;no=no/10)
		{
			int rem = no%10;
			sum=sum+rem;
			
		}
		System.out.println("Sum of the " +sum);
	}

}
