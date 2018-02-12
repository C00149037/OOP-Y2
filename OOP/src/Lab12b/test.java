package Lab12b;

public class test {
	   public static void main(String[] args) {
	      // Test Student class
	      student s1 = new student("John Doe", "1 FairyLand Ave");
	      System.out.println("Student: " + s1.toString());
	      s1.addCourseGrade("H2215", 92);
	      s1.addCourseGrade("H2202", 68);
	      s1.printGrades();
	      System.out.println("Average grade is " + s1.getAverageGrade());
	      
	     
	      
	      //Test teacher class
	      teacher t1 = new teacher("Oisin Cawley", "8 Yellow Brick Road");
	      System.out.println("Teacher: " + t1);
	      String[] courses = {"H2215", "H2202"};
	      for (String course: courses) 			//Note the shortcut technique here for iterating through an array.
	      {
	         if (t1.addCourse(course)) 			//Note that addCourse returns a boolena to indicate success or not.
	         {
	            System.out.println(course + " added.");
	         } 
	         else 
	         {
	            System.out.println(course + " cannot be added.");
	         }
	      }
	      for (String course: courses) 			//Note that removeCourse returns a boolena to indicate success or not.
	      {
	         if (t1.removeCourse(course)) 
	         {
	            System.out.println(course + " removed.");
	         } 
	         else 
	         {
	            System.out.println(course + " cannot be removed.");
	         }
	      }
	   }
	}
