package CA1;

/*
** Author: James Brown
*  Student Number: C00149037 
*  Date: 23 January 2018
** Driver prgram with the details of three Item Objects.
*/

public class Shop {
	
	public static void main(String args[])
	{
	//Create Item 1
	Item item1 = new Item("Football","Sports","11-07-17",'A',5.50);
	
	//Print Item 1's toString
	System.out.println(item1.toString());
	
	//Print number of items created
	System.out.println("\n" + "Number of Sales Items = " + Item.noItems() + "\n");
	
	//Create Item 2
	Item item2 = new Item("Socks","Clothes","14-09-17",'A',2.30);
	
	//Print Item 2's toString
	System.out.println(item2.toString());
	
	//Print number of items created
	System.out.println("\n" +"Number of Sales Items = " + Item.noItems() + "\n");
	
	//Update item 2's status to sold
	item2.StatusUpdate();
	
	//Print item 2's toString
	System.out.println(item2.toString());
	
	//Create item 3
	Item item3 = new Item("Shoes","Footware","25-02-17",'A',45.99);
	
	//Print item 3's toString
	System.out.println("\n" + item3.toString());
	
	//Print number of items create
	System.out.println("\n" + "Number of Sales Items = " + Item.noItems() + "\n");
	
	
	
	
	
	}
}
