package abstractionthree;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		UserService userService = new UserService();
		
		userService.name="Phyo Khant Kyaw";
		
		userService.createUser();
		userService.updateUser(2);
		userService.deleteUser();
	}

}