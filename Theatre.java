package Assignment1;

public class Theatre 
{

	public static void main(String[] args) 
	{
		Theatre raja = new Theatre();
		int balance = raja.bookticket(200);
		System.out.println("After booking ticket " +balance);
	}

	private int bookticket(int i) 
	{
		int ticket_price=120;
		int balance=i-ticket_price;
		return balance;
		
	}

}
