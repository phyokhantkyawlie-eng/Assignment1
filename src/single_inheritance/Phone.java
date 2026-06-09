package single_inheritance;

public class Phone extends Product {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		phone.productName = "iPhone 16 Pro";
		phone.price = 39900;
		phone.brand = "Apple";
		
		phone.showProductInfo();
		
	}

}