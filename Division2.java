package com.bharani;

public class Division2 
{

	public static void main(String[] args) 
	{
		Division2 div = new Division2(); 
		int count = div.count_divisors(100);
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
			    int div = 2; 
			    int count = 0; 
			    while(div<=no/2)
			    {
			      if(no%div==0)
			      {
			        //System.out.println(div);
			        count = count + 1; 
			      }
			    div = div + 1; 
			    }
			    System.out.println("Count of divisors "+count);  
			    return count; 
			  }
}


