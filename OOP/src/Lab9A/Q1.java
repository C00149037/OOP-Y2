package Lab9A;

//Student Name 	: James Brown
//Student Id Number: C00149037
//Date 			: Oct-2017
//Purpose 			: My first class implementation

public class Q1
{ // begin class 
	public static void main(String args[]) 
	{ // being main method

		HotelRoom roomA = new HotelRoom(200,"Single",0,0);		// Create an instance of our Thermometer class
		HotelRoom roomB = new HotelRoom(201,"Double",0,0);
		
		System.out.println("Room A details: \n" + "Number = " 
		+ roomA.getRoomNum() + "\nType = " + roomA.getRoomType());
		System.out.println("\nRoom B details: \n" + "Number = " 
		+ roomB.getRoomNum() + "\nType = " + roomB.getRoomType());
		
		
		
	} // end main
} // end class ThermTest
