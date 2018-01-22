package Lab9B;

public class Rectangle {
	
	private double length;// more about private later
	private double width;
	
	
	public Rectangle()			// constructor method #1
	{
	setLength(1);
	setWidth(1);
	}
	
	public Rectangle(double l,double w)	// constructor method #2
	{
		if(l >= 0 && l <= 40)
		{
			setLength(l);
		}
		if(w >= 0 && w <= 40)
		{
			setWidth(w);
		}
	}
	
	public void setLength(double l) 
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;		
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	public String toString()
	{
		return "Length = " + getLength() + "\nWidth = " + getWidth() ;
	}
	public double getArea()
	{
		return getLength() * getWidth();
	}
	public double getPerimeter()
	{
		return (getWidth() + getLength()) * 2;
	}
	
	
}