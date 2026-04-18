package operator;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int numberOne = 40;
		int numberTwo = 50;
		
		int numberThree = 40;
		int numberFour = 70;
		
		
		boolean logicalAnd = numberOne == numberTwo && numberThree < numberFour;
		
		boolean logicalOr = numberOne == numberTwo || numberThree < numberFour;
		
		
		System.out.println(logicalAnd);
		System.out.println(logicalOr);

	}

}