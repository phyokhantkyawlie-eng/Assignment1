package enumexercise;

public class Main {
	

	
	public static void main(String[] args) {
		
		 User userOne = new User("Mg Mg", MemberAccess.FREE);
		 
		 
		 User userTwo = new User("Aung Aung", MemberAccess.GOLD);
		 
		 
		 User userThree  = new User("Soe Soe", MemberAccess.PlATINUM);
		 
		 
		 if(userOne.getType()  == MemberAccess.FREE) {
			 System.out.println(userOne.getName() + " have " + MemberAccess.FREE.toString()); // String method -> value String vale only 
		 }
		 
		 
		 if(userTwo.getType() == MemberAccess.GOLD) {
			 System.out.println(userTwo.getName() + " have " + MemberAccess.GOLD.toString()); // String method -> value String vale only
		
			 
		 }
		 
		 
		 if(userThree.getType() == MemberAccess.PlATINUM) {
			 														
			 System.out.println(userThree.getName() + " have "+ MemberAccess.PlATINUM.toString()); // String value
			 
			 System.out.println(MemberAccess.PlATINUM); // Enum Value 
		 }
		 
		 
		
		
		
	}

}