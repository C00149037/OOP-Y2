package Lab12b;

public class teacher extends Person{
	
	private int numCourses = 2;
	private String[] courses = new String[numCourses];
	
	// Constructor
		public teacher(String name, String address) 
		{
			super(name,address);
		}
	
		public boolean addCourse(String course)
		{
			if(courses[0] == null)
			{
				courses[0] = course;
				return true;
			}
			else if(courses[1] == null)
			{
				courses[1] = course;
				return true;
			}
			else 
			{
				return false;
			}
			
		}
		public boolean removeCourse(String course)
		{
			if(courses[0] == course)
			{
				courses[0] = null;
				return true;
			}
			else if(courses[1] == course)
			{
				courses[1] = null;
				return true;
			}
			else 
			{
				return false;
			}
			
		}
}
