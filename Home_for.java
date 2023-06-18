package com.bharani;

public class Home_for 
{

	public static void main(String[] args) 
	{
		Home_for work = new Home_for();
//		work.h1();
//		work.h2();
//		work.h3();
//		work.h4();
//		work.h5();
//		work.h6();
//		work.h7();
		
	}

	private void h1() 
	{
		
		for(int num=1;num<6;num++)
		{
			System.out.println("Number is:" +num);
		}
		
	}
	
	private void h2() 
	{
		
		for(int num=2;num<=10;num+=2)
		{
			System.out.println("Number is:" +num);
		}
		
	}
	
	private void h3() 
	{
		
		for(int num=3;num<=15;num+=3)
		{
			System.out.println("Number is:" +num);
		}
		
	}
	
	private void h4() 
	{
		
		for(int num=1;num<10;num+=2)
		{
			System.out.println("Number is:" +num);
		}
		
	}
	
	private void h5() 
	{
		
		
		for(int num=1,amt=1;amt<=5;amt++,num=num+amt)
		{
			
			System.out.println("Amount is:" +num);
			
		}
		
	}
	
	private void h6() 
	{
	
	    for(int i=1;i<6;i++) 
	    {
	      System.out.println(i+" * "+(i+1));    
	    }
		
	}
	
	private void h7() 
	{
		
		for(int i=1;i<6;i++)
	    {
	      System.out.println(i+" * "+(i+1)+" * "+(i+2));    
	    }
		
	}

}
