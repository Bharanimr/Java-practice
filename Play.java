class Play 
{

	public static void main(String[] args) 
	{
		int month = 5;
		int day = 1; 
		while(month==5)
		{
		  System.out.println("Go to Play Day "+day);
		  day = day + 1; 
		  if(day>31)
		  {
		    month = month + 1; 
		  }
		}
		

	}

}
