package Lab12a;

public class Point {
    private int x;
    private int y;

    public Point() 
    	{
    		this(0, 0); // calls the (x, y) constructor
    	}

    public Point(int x, int y) 
    	{
        	this.x = x;
        	this.y = y;
    	}
    public void setX(int X)
		{
			x = X;		
		}
    public void setY(int Y)
		{
			y = Y;		
		}
}
