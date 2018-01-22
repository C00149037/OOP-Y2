package Lab10;

import java.util.Calendar;

//Driver program to test the Time class.
public class Clock
{
	public static void main (String args[])
	{
		Calendar cal = Calendar.getInstance();
		time t = new time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		int nextMinute = t.getMinute() + 1;
		long currentMilliSecond = System.currentTimeMillis() + 1000;
		
		while (t.getMinute() < nextMinute)
		{
			if(System.currentTimeMillis() == currentMilliSecond)
			{
				currentMilliSecond = currentMilliSecond + 1000; 
				t.tick();
				System.out.println(t.toString());
			}
			
			
		}
		
		//System.out.println(System.currentTimeMillis());
	}
}