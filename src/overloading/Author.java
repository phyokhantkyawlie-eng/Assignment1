package overloading;

public class Author {
	
	String authorName;
	String nationality;
	
	
	public Author(String authorName , String nationality) {
		
		this.authorName = authorName;
		this.nationality = nationality;
		
		
	}
	
	public void showAuthorInfo() {
		
		System.out.println("Author Name: "+authorName);
		System.out.println("Nationality: "+nationality);
	}

}