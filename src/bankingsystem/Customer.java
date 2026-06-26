package bankingsystem;

public class Customer {
	
	private String _name;
	
	private String _phone;
	
	private Address address;

	public Customer(String _name, String _phone, Address address) {
		this._name = _name;
		this._phone = _phone;
		this.address = address;
	}

	public String get_name() {
		return _name;
	}

	public String get_phone() {
		return _phone;
	}

	public Address getAddress() {
		return address;
	}
	
	
	
	
	

}