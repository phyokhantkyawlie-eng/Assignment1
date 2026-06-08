package constructoroverloading;

public class Circle {
	
	public int width = 50;
	
	public Circle(int width) {
		System.out.println("Width is " + width);
		System.out.println("Width is " + this.width);
		this.width = width;
		System.out.println("Reassign width is " + this.width);
	}
	
	public String getDetails() {
		
		return "Name is MgMg From GetDetails Method";
		
	}
	
	public void getInfo() {
		System.out.println("This is getInfo Method");
		
		String result = this.getDetails();
		
		System.out.println(result);
	}

}
