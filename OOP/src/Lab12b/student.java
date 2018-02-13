package Lab12b;

public class student extends Person {
	
	//private int numCourses;
	private String[] courses = new String[5];
	private int[] grades = new int[2];
	
	// Constructor
	public student(String name, String address) 
	{
		super(name,address);
	}
	
	public void addCourseGrade(String name , int score)
	{
		if(courses[0] == null)
		{
			courses[0] = name;
			grades [0] = score;
		}
		else if(courses[1] == null)
		{
			courses[1] = name;
			grades [1] = score;
		}
		else
		{
			System.out.println("The courses are full.");
		}
	}
	public void printGrades()
	{
		for (int i =0; i<2; i++)
		{
			System.out.println(courses[i] + ":" + grades[i] );
		}
	}
	public int getAverageGrade()
	{
		return (grades[0] + grades[1])/2;
	}

	

}
