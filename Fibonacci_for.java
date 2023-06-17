package com.bharani;

public class Fibonacci_for 
{

	public static void main(String[] args) 
	{
		Fibonacci_for fib = new Fibonacci_for();
		fib.find_fibonacci();
	}

	private void find_fibonacci() 
	{
		for(int a=0,b=1;a<=13;)
		{
			int c=a+b;
			System.out.print(a+ " ");
			a=b;
			b=c;
		}
	}

}
