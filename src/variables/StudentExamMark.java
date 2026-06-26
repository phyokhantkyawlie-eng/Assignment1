package variables;

public class StudentExamMark {

	public static void main(String[] args) {
		
		String studentName = "James";
		
		String subjectOne = "CSC-454";
		
		String subjectTwo = "CSC-420";
		
		char grade = 'A';
		
		
		double subOneMark = 70.25;
		double subTwoMark = 80.45;
		
		double total = subOneMark + subTwoMark; 
		
	
		// type casting change long code  ** primitive to primitive 
//		int markTotal = (int) total;
		
		
		// type casting change ** primitive to reference double to String
		String markTotal = String.valueOf(total);
		
		
		String markOne = "70";
		String markTwo = "90";
		
		// Type Casting refer -> prim String int 
		
		
		
		int totalStringMark = Integer.parseInt(markOne) + Integer.parseInt(markTwo);
		
		double totalStirngValue = Double.parseDouble(markOne) + Double.parseDouble(markTwo);
		
		
		
		
	
		System.out.println("Name :"+studentName);
		System.out.println(subjectOne +"="  + subOneMark);
		System.out.println(subjectTwo +"=" + subTwoMark);
		System.out.println("Total Mark :"+(int) total); // short code
		System.out.println("Grade :" +grade);
		
		System.out.println("Type Casting Change value" + markTotal); 
		
		
		System.out.println("String mark total "+ totalStringMark);
		
		

	}

}