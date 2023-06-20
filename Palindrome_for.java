package com.bharani;

public class Palindrome_for 
{

	public static void main(String[] args) 
	{
		Palindrome_for pali = new Palindrome_for();
		int no=22;
		int rev = pali.reverse_number(no);
		System.out.println("Reversed number is " +rev);
		if(no==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	private int reverse_number(int no)
	{
		int reverse=0;
	    for(;no>0;no=no/10)
	    {
	      int rem = no%10; //2
	      reverse = (reverse*10) + rem; //4
	    }
	    //System.out.println(reverse);
	    return reverse;
	}

}
