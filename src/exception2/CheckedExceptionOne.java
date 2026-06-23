package exception2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionOne {
	
	// File / IO 
	private void textFileRead ()  throws Exception{
	
		
//		try {
//			
//			File file = new File("/Users/htooauntshein/Desktop/iotest.txt");
//			
//			FileReader fileReader = new FileReader(file);// Code Write Time
//			
//			int i ;
//			
//			while ( (i = fileReader.read()) != -1) {
//				System.out.print( (char)i);
//			}
//		}catch (IOException e) {
//			System.out.println("File Not Found.");
//		}
		
		

		File file = new File("/Users/htooauntshein/Desktop/iotest.txt");
		
		FileReader fileReader = new FileReader(file);    // Code Write Time
		
		int i ;
		
		while ( (i = fileReader.read()) != -1) {
			System.out.print( (char)i);
		}
		
		
	}
	
	public static void main(String[] args) throws Exception{
		
		
		
		CheckedExceptionOne c = new CheckedExceptionOne();
		c.textFileRead();
	}

}