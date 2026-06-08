package classworksassignment;

import javax.swing.JOptionPane;

public class Student {
	
	
	String name;
	String studentID;
	int age;
	String nationality;
	
	
	public Student() {
		
	}
	
	public Student(String name, String studentID, int age, String nationality) {
		
		this.name = name;
		this.studentID = studentID;
		this.age = age;
		this.nationality = nationality;
		
	}
	
	
	public void getStart() {
		
		String name = JOptionPane.showInputDialog("Enter Your Name");
		String studentID = JOptionPane.showInputDialog("Enter Your ID");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		String nationality = JOptionPane.showInputDialog("Enter Your Natonality");
		
		Student s = new Student(name,studentID,age,nationality);
		
		
		checkingAge(s);
		
		
		
		
	}
	
	
	public void checkingAge(Student s) {
		
		if (s.age >= 18) {
			this.getMarks(s);
		}else {
			JOptionPane.showMessageDialog(null, "Your are not allowed in this System.");
		}
		
	}
	
	public void getMarks(Student s) {
		
		
		String [] marks = new String[2];
		
		int row = 0;
		
		while (row < marks.length) {
			if(row== 0) {
				marks[row] = JOptionPane.showInputDialog("Enter Subject One Mark");
				
			}
			
			if(row == 1) {
				marks[row] = JOptionPane.showInputDialog("Enter Subject Two Mark");
				
			}
			
			row++;
			
		}
	
		
		String output = "Student Information";
		
		output+="Name is "+s.name+"\n";
		output+="Age is  "+s.age+"\n";
		output+="Student Id is "+s.studentID+"\n";
		output+="Nationality is "+s.nationality+"\n";
		output+="Subject One Mark is "+marks[0]+"\n";
		output+="Subject Two Mark is "+marks[1]+"\n";
		
		JOptionPane.showMessageDialog(null, output);
		
		
		
		
		
		
	}
	 

}