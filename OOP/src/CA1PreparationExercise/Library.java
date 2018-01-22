package CA1PreparationExercise;

public class Library {
	
	public static void main(String args[])
	{
	
	Book book1 = new Book("Maths","Tom","Education",'A');
	System.out.println(Book.noOfBooks());
	System.out.println(book1.toString());
	Book book2 = new Book("English","Bob","Education",'A');
	System.out.println(Book.noOfBooks());
	System.out.println(book2.toString());
	book2.Borrow();
	System.out.println(book2.toString());
	Book book3 = new Book("History","Jim","Education",'B');
	System.out.println(Book.noOfBooks());
	System.out.println(book3.toString());
	
	
	
	
	
	}
}
