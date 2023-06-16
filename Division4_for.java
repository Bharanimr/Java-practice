package com.bharani;

public class Division4_for 
{

	public static void main(String[] args) 
	{
		int no=100;
		int smallest=-1;
		for(int div=2;div<no;div++)
		{
			if(no%div==0)
			{
				//System.out.println(div);
				smallest=div;
				break;
			}
		}
		System.out.println(smallest);
	}

}
