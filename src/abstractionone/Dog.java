package abstractionone;

public class Dog extends Animal{

	@Override
	void fly() {
		System.out.println(name + " cannot fly.");
		
	}
	
	@Override
	void eat() {
		System.out.println(name + " eat bones");
		
	}
	
	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		dog.name ="Aung Net";
		
		dog.fly();
		
		dog.eat();
	}

	
	
	
	

}