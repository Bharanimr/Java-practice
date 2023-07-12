package com.bharani;

public class Bharani 
{

	public static void main(String[] args) 
	{
		Bharani bn = new Bharani();
		bn.pattern_B();
		bn.pattern_H();
		bn.pattern_A();
		bn.pattern_R();
		bn.pattern_A2();
		bn.pattern_N();
		bn.pattern_I();
	}

	private void pattern_B() 
	{
		for (int line=1;line<=7;line++)
	    {     
	         for (int star=1;star<=7;star++)
	         {
	           if (line==1 || line==4 || line==7) 
	           {
	             if (star==6 || star==7 || star==5) 
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
	             if (line==2 || line==3 || line==5 || line==6 || line==7) 
	             {
	               if (star==1||star==5) 
	               {
	                 System.out.print("* ");
	               }
	               else 
	               {
	                 System.out.print("  ");
	               }
	             }
	           }
	         }
	          System.out.println();
	    }		
		System.out.println();
	}
	
	private void pattern_H() 
	{
		for(int line=1;line<=7;line++)
		{
			if(line<=7)
			{
				for(int star=1;star<=7;star++)
				{
					if(star==1 || star==7 || line==4)
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
		System.out.println();
	}
	
	private void pattern_A() 
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
	
	private void pattern_R() 
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
	
	private void pattern_A2() 
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
	
	private void pattern_N() 
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
		System.out.println();
	}
	
	private void pattern_I() 
	{
		for(int star=1; star<=7; star++)
	    {
			System.out.print("* ");
	    }
	    System.out.println();
	    for(int star=1; star<=6; star++)
	    {
	    	for(int space=1; space<=6; space++)
	        {
	    		System.out.print(" ");
	        }
	    	System.out.println("* ");
	    }
	    for(int star=1; star<=7; star++)
	    {
	    	System.out.print("* ");
	    }			
	}


	

}
