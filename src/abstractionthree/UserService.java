package abstractionthree;

public class UserService implements UserInterface,AddressInterface{
	
	String name;

	@Override
	public void createUser() {
		
		System.out.println(name +  " Create User successfully.");
		
	}

	@Override
	public void updateUser(int id) {
		
		System.out.println(id + " Update User successfully.");
	}

	@Override
	public void deleteUser() {
		
		System.out.println(name + " Delete User Successfully.");
	}

	@Override
	public void createAddress() {
		System.out.println("Create address Successful.");
		
	}
	


}