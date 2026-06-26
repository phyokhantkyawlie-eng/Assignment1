package controlflow;

import java.util.Arrays;

// For each looping

/**
 * 
 *  for (Variables : Data Collections){
 *  		statement
 *  }
 * 
 */
public class IterationFour {

	public static void main(String[] args) {
		
		
		String [] names = {"Mg Mg","Aung Aung", "Tun Tun","Su Su","Nu Nu"}; 
		
		// 		 Variable	Data Collection
		for (String name  : names ) {
			
			System.out.println(name);
		}
		
		
		int [] numbers = {1,2,3,4,5,6,7};
		
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("This is using for each loop");
		for (int i :  numbers) {
			System.out.println(i);
		}

	}

}