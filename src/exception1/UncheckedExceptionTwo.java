package exception1;

public class UncheckedExceptionTwo {
	
	
	private void test() {
		
		String name= null;
		
		
		try {
			
			System.out.println(name.length()); // error occur
			
			
		}catch(NullPointerException e) {
			System.out.println("This name is null so cannot read length");
		}
		
		
	}

	
	public static void main(String[] args) {
		
		
		
		UncheckedExceptionTwo uet = new UncheckedExceptionTwo();
		
		uet.test();
	}

}