package inheritance_programs;

public class LibraryBook extends Book{
	
	
	String category;
	boolean avaiable;

	public LibraryBook(String title, String author, String isbn, String category, boolean avaiable) {
		super(title, author, isbn);
		
		this.category =category;
		this.avaiable = avaiable;
		
	
		
	}
	
	public void getLibraryBookInfo() {
		
		showBookInfo();
		
		System.out.println("Category :"+category);
		
		if (avaiable) {
			System.out.println("Status : Avaiable");
			
		}else {
			System.out.println("Status : Borrowed");
		}
		
		System.out.println("----------------------");
	}

}