package enumexercise;

public class User {
	
	
	String name;
	Enum type; // Enum Object 
	
	
	
    public User(String name , Enum type) {
    	
    	this.name = name;
    	this.type = type;
    	
    	
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Enum getType() {
		return type;
	}



	public void setType(Enum type) {
		this.type = type;
	}
    
    

}