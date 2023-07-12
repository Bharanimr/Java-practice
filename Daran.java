package com.bharani;

public class Daran {

	public static void main(String[] args) 
	{
		Daran dn = new Daran();
		dn.Pattern_D();
		dn.Pattern_A();
		dn.Pattern_R();
		dn.Pattern_A2();
		dn.Pattern_N();
	}

	private void Pattern_D() 
	{
		for(int line=1;line<=7;line++)
		{
		    for(int star=1;star<=7;star++)
		    {
		    	if(line==1 || line==7 || star==2 || star==7)
		    	{
		    		if(line==1 && star==7 || line==7 && star==7)
		    		{
		    			System.out.print(" ");
		    		}
		    		else
		    		{
		    			System.out.print("* ");
		    		}
		    	}
		    	else
		    	{
		    		System.out.print("  ");
		    	}
		    }
		    System.out.println();
		}	
		System.out.println();
	}
	
	private void Pattern_A() 
	{
		for (int line= 1; line<=7; line++) 
		{
            for (int star = 1; star <=7; star++) 
            {
                if(line==1)
                {
                  if(star==1||star==7)
                    System.out.print("  ");
                  else
                    System.out.print("* ");
                }
                else
                {
                  if(star==1||star==7||line==4)
                    System.out.print("* ");
                  else
                    System.out.print("  ");
                
                }
            }
            System.out.println();
		}
		System.out.println();	
	}
	
	private void Pattern_R() 
	{
		for (int line = 1; line<=7; line++) 
	     {
	             for (int star= 1; star <=7; star++)
	             {
	                if(line==1|| line==4|| star==1)
	                {
	                  if(line==1 && star==1||line==1 && star==7||line==4 && star==7)
	                  {
	                     System.out.print("  ");
	                  }
	                  else
	                  {
	                    System.out.print("* ");
	                  }   
	                }
	                else
	                {
	                  if(line==5 && star==5||line==6 && star==6||line==7 && star==7||line==2 && star==7||line==3 && star==7)
	                  {
	                    System.out.print("* ");
	                  }
	                  else
	                  {
	                    System.out.print("  ");
	                  }
	                } 
	             }
	             System.out.println();
	              
	        }
		System.out.println();		
	}
	
	private void Pattern_A2() 
	{
		for (int line= 1; line<=7; line++) 
		{
            for (int star = 1; star <=7; star++) 
            {
                if(line==1)
                {
                  if(star==1||star==7)
                    System.out.print("  ");
                  else
                    System.out.print("* ");
                }
                else
                {
                  if(star==1||star==7||line==4)
                    System.out.print("* ");
                  else
                    System.out.print("  ");
                
                }
            }
            System.out.println();
		}
		System.out.println();		
	}
	
	private void Pattern_N() 
	{
		for(int line = 1; line<=7;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	          if(star==1 || star==7 || star==line)
	          {
	        	  System.out.print("* ");
	          }
	          else
	          {
	        	  System.out.print("  "); 
	          }
	        }
	        System.out.println(); 
	    }		
	}


}
