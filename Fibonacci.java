package com.bharani;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Fibonacci fib = new Fibonacci();
		fib.find_fibonacci();
	}

	private void find_fibonacci() 
	{
		int a=0, b=1;
		while(a<=13)
		{
			int c=a+b;
			System.out.print(a+ " ");
			a=b;
			b=c;
		}
		
	}

}
