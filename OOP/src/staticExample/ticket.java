package staticExample;

public class ticket{
	
	private static int numTicketsSold = 0; // shared
	private int ticketNum; // one per object
	
	public ticket(){
		numTicketsSold++;
		ticketNum = numTicketsSold;
		}
	public static int getNumberSold() 
	{ 
		return numTicketsSold; 
	}
	public int getTicketNumber() 
	{ 
		return ticketNum; 
	}
	public String getInfo()
	{
		return "ticket # " + ticketNum + "; " +
				numTicketsSold + " ticket(s) sold.";
	}
}
