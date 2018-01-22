package Lab12a;

public class Circle extends Point
	{
	  public double x, y;  	// coordinates of the centre    
	  public double r;	// the radius
	
	  public Circle(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}


	// Methods that return the circumference 
	  //and area of the circle
	  public double circumference() 
	  { 
		 return 2 * Math.PI * r;
	  }
	 
	  
	  public double area() 
	  { 
		 return Math.PI * r * r; 
	  }
	}
