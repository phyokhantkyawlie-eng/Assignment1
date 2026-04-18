package operator;

public class RelationalOperators {

	public static void main(String[] args) {
	 
		int numberOne = 60;
		
		int numberTwo = 60;

		boolean isSame = numberOne == numberTwo;
		System.out.println(isSame);

		boolean notEqual = numberOne != numberTwo;
		System.out.println(notEqual);

		boolean greaterThan = numberOne > numberTwo;
		System.out.println(greaterThan);

		boolean lessThan = numberOne < numberTwo;
		System.out.println(lessThan);

		boolean greaterOrEqual = numberOne >= numberTwo;
		System.out.println(greaterOrEqual);

		boolean lessOrEqual = numberOne <= numberTwo;
		System.out.println(lessOrEqual);

	}

}