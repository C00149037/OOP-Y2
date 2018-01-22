package Lab9B;

//Student Name 	: James Brown
//Student Id Number: C00149037
//Date 			: Oct-2017
//Purpose 			: My first class implementation

public class Q2
{ // begin class 
	public static void main(String args[]) 
	{ // being main method

		Rectangle Rect1 = new Rectangle(2,5);		// Create an instance of our Rectangle class
		System.out.println(Rect1.toString());
		System.out.println("Area = " + Rect1.getArea());	
		System.out.println("Perimeter =   " + Rect1.getPerimeter());	
	} // end main
} // end class 
