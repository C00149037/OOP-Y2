package Lab9A;

//Student Name 	: James Brown
//Student Id Number: C00149037
//Date 			: Oct-2017
//Purpose 			: My first class implementation

public class Q3
{ // begin class 
	public static void main(String args[]) 
	{ // being main method

		HotelRoom roomA = new HotelRoom(200,"Single",1,100);		// Create an instance of our Thermometer class
		HotelRoom roomB = new HotelRoom(201,"Double",0,80);
		HotelRoom roomC = new HotelRoom(202,"Single",0,90);
		
		System.out.println("Room A details: \n" + "Number = " 
		+ roomA.getRoomNum() + "\nType = " + roomA.getRoomType()
		+ "\nOccupied = " + roomA.getTaken() + "\nRate = " + 
		roomA.getRate());
		
		System.out.println("\nRoom B details: \n" + "Number = " 
		+ roomB.getRoomNum() + "\nType = " + roomB.getRoomType()
		+ "\nOccupied = " + roomB.getTaken() + "\nRate = " +
		roomB.getRate());
		
		System.out.println("\nRoom C details: \n" + "Number = " 
				+ roomC.getRoomNum() + "\nType = " + roomC.getRoomType()
				+ "\nOccupied = " + roomC.getTaken() + "\nRate = " +
				roomC.getRate());
			
	} // end main
} // end class 
