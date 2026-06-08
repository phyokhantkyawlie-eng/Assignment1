package inheritance_programs;

public class LibraryItem {
	
	
	String title;
	
	String author;
	
	
	public LibraryItem(String title, String author) {
		
		this.title = title;
		
		this.author = author;
	}
	
	
	public void showItemInfo() {
		
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}

}