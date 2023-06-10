package com.bharani;

public class Swapping 
{
	
	public static void main(String[] args) 

	{
		Swapping sw = new Swapping();
		sw.swap_amount(10,20);
	}

	private void swap_amount(int old_coin, int new_coin) 
	{
		System.out.println("Old " +old_coin);
		System.out.println("New " +new_coin);
		
		int box=old_coin;
		old_coin=new_coin;
		new_coin=box;
		
		System.out.println("Old " +old_coin);
		System.out.println("New " +new_coin);
		
	}

}
