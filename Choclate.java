package com.bharani;

import java.util.Scanner;
public class Choclate 
{

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of chocolates you have: ");
		int numChocolates = sc.nextInt();

		System.out.print("Enter the number of wrappers needed to exchange for a new chocolate: ");
		int numWrappers = sc.nextInt();

		int totalChocolates = numChocolates;
		int remainingWrappers = numChocolates;

		while (remainingWrappers >= numWrappers) 
		{
			int exchangedChocolates = remainingWrappers / numWrappers;
			totalChocolates += exchangedChocolates;
			remainingWrappers = exchangedChocolates + (remainingWrappers % numWrappers);
		}

		System.out.println("Total number of chocolates you can have: " + totalChocolates);
	}
		
		
	}


