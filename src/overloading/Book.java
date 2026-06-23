package overloading;

public class Book extends LibraryItem{
	
	Author author; // Composition
	double price;
	
	
	
	

	public Book(String title, String itemcode, Author author , double price) {
		super(title, itemcode);
		
		this.author = author;
		
		this.price = price;
	
	}
	// Override
	
	@Override
	public void showInfo() {
		System.out.println("=====Book Information=====");
		System.out.println("Title :"+title);
		System.out.println("Item Code :"+itemcode);
		author.showAuthorInfo();
		System.out.println("Price :"+price);
	}
	
	// Overloading
	public void borrowBook() {
		System.out.println(title + " is borrowed.");
	}
	
	public void borrowBook(String borrowerName) {
		
		System.out.println(borrowerName + " borrowed "+title);
		
	}
	
	
	public void borrowBook(String borrowerName, int days) {
		
		System.out.println(borrowerName + "borrwed " +title + " for "+ days);
	}
	
	
	
	
	
	

}