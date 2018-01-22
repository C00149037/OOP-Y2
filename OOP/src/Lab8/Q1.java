package Lab8;

//Student Name 	: James Brown
//Student Id Number: 
//Date 			: Oct-2017
//Purpose 			: My first class implementation

public class Q1
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		Thermometer thermB = new Thermometer(10);
		int tempB = (int) thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + tempB );
		
	} // end main
} // end class ThermTest
