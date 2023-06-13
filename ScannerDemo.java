package com.bharani;

import java.util.Scanner;

public class ScannerDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//INT
//	    System.out.println("Enter no1. ");
//	    int no1 = sc.nextInt();
//	    
//	    System.out.println("Enter no2. ");
//	    int no2 = sc.nextInt(); 
//	    
//	    System.out.println("Result is ");
//	    System.out.println(no1+no2);
	    
	    //STRING
//	    System.out.println("Tell me your name "); 
//	    String name = sc.next(); 
//	    System.out.println("Welcome to IT World "+ name);
	    
	    //NEXTLINE
//	    System.out.println("Tell me your name "); 
//	    String name1 = sc.nextLine(); 
//	    System.out.println("Welcome to IT World "+ name1);
	    
	    //SIMPLE
	    System.out.println("Tell me any no. "); 
	    int no = sc.nextInt();
	    while(no>=1)
	    {
	      System.out.println(no); 
	      no--; 
	    }
	    
	}

}
