package overloading;

public class LibraryItem {
	
	String title;
	String itemcode;
	
	
	public LibraryItem  (String title , String itemcode) {
		
		this.title = title;
		
		this.itemcode = itemcode;
	}
	
	public void showInfo() {
		
		System.out.println("Title :"+ title);
		
		System.out.println("Item Code :"+itemcode);
		
	}

}