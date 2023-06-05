package com.bharani;

public class Pincode 
{

	public static void main(String[] args) 
	{
		Pincode pin = new Pincode();
		pin.code();
	}

	private void code() 
	{
		int no=600037;
		no=no/1000;
		while(no<650)
		{
			if(no==620)
			{
				System.out.println("Trichy");
				
			}
			if(no==600)
			{
				System.out.println("Chennai");
				
			}
			if(no==637)
			{
				System.out.println("Namakal");
				
			}
		    no=no+1;
		}
	}

}
