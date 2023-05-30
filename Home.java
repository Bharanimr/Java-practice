package com.bharani;

public class Home 
{

	public static void main(String[] args) 
	{
		Home work = new Home();
		work.h1();
//		work.h2();
//		work.h3();
//		work.h4();
//		work.h5();
//		work.h6();
//		work.h7();
	}

	private void h1() 
	{
		int num=1;
		
		while(num<6)
		{
			System.out.println("Number is:" +num);
			num=num+1;
		}
	}
	
	private void h2() 
	{
		int num=2;
		
		while(num<=10)
		{
			System.out.println("Number is:" +num);
			num=num+2;
		}
		
		
	}
	
	private void h3() 
	{
		int num=3;
		
		while(num<=15)
		{
			System.out.println("Number is:" +num);
			num=num+3;
		}
		
		
	}
	
	private void h4() 
	{
		int num=1;
		
		while(num<10)
		{
			System.out.println("Number is:" +num);
			num=num+2;
		}
		
	}
	
	private void h5() 
	{
		int num=1;
		int amt=1;
		while(amt<=5)
		{
			System.out.println("Amount is:" +num);
			amt=amt+1;
			num=num+amt;
		}
		
	}
	
	private void h6() 
	{
		int i=1;  //initialization
	    while(i<6)  // condition
	    {
	      System.out.println(i+" * "+(i+1));    
	      i=i+1;  //increment
	    }
		
	}
	
	private void h7() 
	{
		int i=1;  //initialization
	    while(i<6)  // condition
	    {
	      System.out.println(i+" * "+(i+1)+" * "+(i+2));    
	      i=i+1;  //increment
	    }
		
	}
	

}
