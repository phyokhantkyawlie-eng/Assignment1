package inheritance_programs;

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		LibraryBook[] books = new LibraryBook[3];
		
		
		
		int i = 0;
		
		while (i < books.length) {
			
			System.out.println("Enter Book "+(i+1));
			
			System.out.println("Enter Book Title");
			String title = sc.nextLine();
			
			
			System.out.println("Enter Author Name");
			String author = sc.nextLine();
			
			
			System.out.println("Enter Book ISBN");
			String isbn = sc.nextLine();
			
			
			System.out.println("Enter Book Category");
			String category = sc.nextLine();
			
			
			System.out.println("Is Book is avaiable ? true / false");
			
			boolean avaiable = Boolean.parseBoolean(sc.nextLine());
			
			
			books[i] = new LibraryBook(title, author, isbn, category, avaiable);
			
			i++;
		}
		
		
		System.out.println("\n Library Book List \n");
		
		for(LibraryBook book :books) {
			
			book.getLibraryBookInfo();
		}
		
		sc.close();
	}

}