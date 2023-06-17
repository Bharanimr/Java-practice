package com.bharani;

public class Fibonacci2_for 
{

	public static void main(String[] args) 
	{
		Fibonacci2_for fib = new Fibonacci2_for();
		fib.fib_without_third_variable();
	}

	private void fib_without_third_variable() 
	{
		int count=0;
		for(int a=0,b=1;count<5;count++)
		{
			System.out.println(a);
			a=b-a; 
			b=a+b; 
		}
	}

}
