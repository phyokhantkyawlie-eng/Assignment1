package constructoroverloading;

public class ProgramOne {

	public static void main(String[] args) {
		
		Animal animalOne = new Animal("Aung Net", "Mae Lone", "Mi Nyo");
		
		animalOne.age=12;
		animalOne.species="Dog";
		animalOne.food= "fish and bones";
				
		animalOne.getDetails();
				

	}

}
