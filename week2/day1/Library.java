package week2.day1;

public class Library {
	public String addBook(String bookTitle)
	{
		System.out.println(bookTitle + " " + "Book added successfully");
		return bookTitle;
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) 
	{
		
    Library actions=new Library();
    actions.addBook("Fiction");
    actions.issueBook();
    String bookTitle1=actions.addBook("Comic");
    System.out.println("Return value from Method:-"+ " "+ bookTitle1);
    
	}

}
