package com.bharani;

public class Fibonacci2 
{

	public static void main(String[] args) 
	{
		Fibonacci2 fib = new Fibonacci2();
		fib.fib_without_third_variable();
		
	}

	private void fib_without_third_variable() 
	{
		int count=0;
		int a=0,b=1;
		while(count<5)
		{
			System.out.print(a+" ");
			a=b-a;
			b=a+b;
			count+=1;
		}
	}

}
