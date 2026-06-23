package abstractionone;

public class Bird extends Animal{

	@Override
	void fly() {
		System.out.println(name + " can fly in the sky");
		
	}

	@Override
	void eat() {
	
		System.out.println(name + " eat fishes.");
	}
	
	public static void main(String[] args) {
		
		
		Bird bird = new Bird();
		
		bird.name="Nightingale";
		bird.eat();
		bird.fly();
	}
	
	

}