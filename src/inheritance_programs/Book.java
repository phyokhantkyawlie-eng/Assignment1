package inheritance_programs;

public class Book extends LibraryItem{
	
	
	String isbn;

	public Book(String title, String author,String isbn) {
		super(title, author);
		
		this.isbn = isbn;
		
	}
	
	
	public void showBookInfo() {
		
		showItemInfo();
		
		System.out.println("ISBN :"+isbn);
	}

}