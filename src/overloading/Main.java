package overloading;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		Book[] libBooks = new Book[3];
		
		int i = 0;
		
		while ( i < libBooks.length) {
			
			JOptionPane.showMessageDialog(null, "Enter Book "+ (i+1)+ " data ");
			
			String title = JOptionPane.showInputDialog("Enter Book Title");
			
			String itemcode = JOptionPane.showInputDialog("Enter Book Itemcode");
			
			String authorName = JOptionPane.showInputDialog("Enter Book Author Name");
			
			String nationality = JOptionPane.showInputDialog("Enter Book Nationality");
			
			double price = Double.parseDouble(JOptionPane.showInputDialog("Enter Book Price"));
			
			
			Author author = new Author(authorName, nationality);
			
			libBooks[i] = new Book(title, itemcode, author, price);
			
			i++;
			
			
		}
		
		System.out.println("\n=====Library Book List=====");
		
		for (Book book : libBooks) {
			
			book.showInfo();
		}
		
		libBooks[0].borrowBook();
		libBooks[1].borrowBook("Phyo");
		libBooks[2].borrowBook("Paing Khant Kyaw", 7);
		
		
	}

}