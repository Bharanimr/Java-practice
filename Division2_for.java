package com.bharani;

public class Division2_for 
{

	public static void main(String[] args) 
	{
		Division2_for div = new Division2_for(); 
		int count = div.count_divisors(17);
		div.find_prime_no(count);
	}
	private void find_prime_no(int count) 
	  {
	    if(count==0)
	    {
	      System.out.println("Prime number");
	    }
	    else
	    {
	      System.out.println("Not Prime");
	    }
	    
	  }
	  private int count_divisors(int no) 
	  {
	    int count = 0; 
	    for(int div=2;div<=no/2;div++)
	    {
	      if(no%div==0)
	      {
	        //System.out.println(div);
	        count = count + 1; 
	      } 
	    }
	    System.out.println("Count of divisors "+count);  
	    return count; 
	  }

}
