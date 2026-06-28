package mathematics_usage;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		int val = 5;
		
		int value = -3;
		
		System.out.println(Math.abs(val)); // absolute value
		
		
		System.out.println(Math.abs(value));
		
		//  floor- 10 		10.5	11-ceil
		
		double d  = 10.5;
		
		System.out.println(Math.ceil(d));
		
		System.out.println(Math.floor(d));
		
		
		int i = 12312356;
		
		int t = 7987234; 
		
		System.out.println(Math.min(i, t)); // less value take
		
		System.out.println(Math.max(i, t)); // greater value take
		
		
		int a = 2;
		
		int b = 5;
									//2 , 5
		System.out.println(Math.pow(a, b)); // 2 * 2 * 2 -> 8
		
		
		for (int k = 0 ; k < 100 ; k ++) {
			
			System.out.println((int)(Math.random() * 100));   // ramdom value get
		}
		
		
		System.out.println("This is ramdom value from math lib " + Math.random());
		
		
		
		double e = 20.8;
		
		System.out.println(Math.round(e)); // rounding   20   	20.8		 21 21
		
	}

}