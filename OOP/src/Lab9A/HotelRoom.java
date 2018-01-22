package Lab9A;

public class HotelRoom {
	
	private int roomNum;// more about private later
	private String roomType;
	private int taken;
	private int rate;
	private boolean occupied = false;
	
	public HotelRoom()			// constructor method #1
	{
	setRoomNum(0);
	setRoomType("");
	setTaken(0);
	setRate(0);
	}
	
	public HotelRoom(int num,String type,int x,int r)	// constructor method #2
	{
	setRoomNum(num);
	setRoomType(type);
	setTaken(x);
	setRate(r);
	}
	
	public void setRoomType(String type) 
	{
		roomType = type;
	}
	public void setRoomNum(int num)
	{
		roomNum = num;		
	}
	public void setTaken(int x)
	{
		taken = x;
		if (taken == 0)
		{
			occupied = false;
		}
		else 
		{
			occupied = true;
		}
	}
	public void setRate(int r)
	{
		rate = r;
	}
	public int getRoomNum()
	{
		return roomNum;
	}
	public String getRoomType()
	{
		return roomType;
	}
	public int getTaken()
	{
		return taken;
	}
	public int getRate()
	{
		return rate;
	}
	public boolean isOccupied(int now)
	{
		if(now == 0)
		{
			occupied = false;
		}
		else
		{
			occupied = true;
		}
		return occupied;
	}
}