package Lab10;

//Driver program to test the Time class.
public class timeTest
{
	public static void main (String args[])
	{
		time t = new time (23, 59, 59);
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
		t.tick();
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
	}
}