package abstractiontwo;
// Inheritance -> Interface keyword implements
public class Phone implements Device{

	@Override
	public void type() {
		System.out.println("Typing on the screen.");
		
	}

	@Override
	public void speak() {
		System.out.println("Speak with microphone.");
		
	}

	@Override
	public void listening() {
		System.out.println("Listening with Speaker.");
		
	}
	
	@Override
	public void message() {
		System.out.println("Sent message with SMS.");
		
	}
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		phone.type();
		phone.speak();
		phone.listening();
		phone.message();
	}



}