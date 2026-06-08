package classandobjecthomework;

public class Main {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.name = "Mae Lone";
		dog1.age = 2;
		dog1.color = "Black";
		
		dog1.showInfo();
		dog1.eat();
        dog1.sleep();
        dog1.play();
        
        dog1.bark();
        dog1.bark("Woof Woof!");
	}

}
