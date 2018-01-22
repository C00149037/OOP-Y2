package CA1PreparationExercise;

public class Book {
	
	private String BookName;
	private String Author;
	private int ISBN ;
	private String Genre;
	private char Status;
	private static int NoBooks;
	

	public Book(String bookName, String author, String genre, char Status) 
		{
			NoBooks++;
			ISBN = NoBooks;
			setBookName(bookName);
			setAuthor(author);
			//setISBN(iSBN);
			setGenre(genre);
			setStatus(Status);
		}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public char getStatus() {
		return Status;
	}
	public void setStatus(char status) {
		Status = status;
	}
	
	public String toString() 
	{
		return "BookName = " + BookName + ", Author = " + Author + ", ISBN = " + ISBN + ", Genre = " + Genre + ", Status = "
				+ Status ;
	}
	public void Borrow()
	{
		setStatus('B');
	}
	
	public static int noOfBooks()
	{
		return NoBooks;
	}

}
