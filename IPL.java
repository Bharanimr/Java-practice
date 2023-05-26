class IPL 
{

	public static void main(String[] args) 
	{
	    
	    IPL ipl=new IPL();
	    int mi=210, gt=40;
	    ipl.play_qualifier(mi,gt);
	    ipl.play_qualifier2(mi,gt);
	 }

	  private void play_qualifier2(int mi, int gt)
	  {
	    if(mi>gt)
	      {  
	        int csk = 99; 
	        mi = 230; 
	        if(csk>mi)
	        {
	          System.out.println("Dhoni gets 5th trophy");
	        }
	        else
	        {
	          System.out.println("Rohit gets 6th trophy");
	        }
	        
	      }
	    else
	    {
	      int csk = 210; 
	        gt = 215; 
	        if(csk>gt)
	        {
	          System.out.println("Dhoni gets 5th trophy");
	        }
	        else
	        {
	          System.out.println("Pandya gets 2nd trophy");
	        }
	        
	    }
	      
	    
	  }

	  private void play_qualifier(int team1, int team2) 
	  {
	    if(team1>team2)
	    {
	      System.out.println("MI enters the finals");
	    }
	    else
	    {
	      System.out.println("GT enters the finals");
	    }
	    
	  }


}

