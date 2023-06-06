package com.bharani;

public class Armstrong2 
{

	public static void main(String[] args) 
	{
		int no,rem,res;
	    res=0;
	    no=153;
	    int temp=no;
	    while (temp!= 0)
	    {
	    	rem = temp% 10;
	        res += Math.pow(rem, 3);
	        temp/= 10;
	    }
	    System.out.println(res);
	    if(res == no)
	    {
	    	System.out.println(no + " is an Armstrong number");
	    }
	    else
	    {
	    	System.out.println(no + " is not an Armstrong number");
	    }

	 }
	

}
