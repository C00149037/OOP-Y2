package CA1;

/*
** Author: James Brown
*  Student Number: C00149037 
*  Date: 23 January 2018
** Item Class storing item data.
*/

public class Item
{
	//Variables
	private int ItemID;
	private String Name;
	private String Type;
	private String ManFacDate;
	private char Status;
	private double Price;
	private static int NoItems; 
	
	//Constructor
	public Item(String name, String type, String manFacDate, char status, double price) 
	{
		NoItems++;			 //Increases after an item is created
		ItemID = NoItems;    //Item ID maintained by the class
		setName(name);
		setType(type);
		setManFacDate(manFacDate);
		setStatus(status);
		setPrice(price);
	}
	//Getters and Setters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getManFacDate() {
		return ManFacDate;
	}

	public void setManFacDate(String manFacDate) {
		ManFacDate = manFacDate;
	}

	public char getStatus() {
		return Status;
	}
	
	public void setStatus(char status) {
		Status = status;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	//class toString method
	public String toString() {
		return "ItemID = " + ItemID + "\n" + "Name = " + Name + "\n" + "Type = " + Type + "\n" + "ManFacDate = " + ManFacDate
				+ "\n" + "Status = " + Status + "\n" + "Price = " + Price;
	}
	//Static method for returning number of items.
	public static int noItems()
	{
		return NoItems;
	}
	//Class Method for updating status
	public void StatusUpdate()
	{
		setStatus('S');
	}
	
}

