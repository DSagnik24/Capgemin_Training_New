package Constructor.HeirarchialInheritance;

public class Animal {
	String species;
	String foodType;
	
	
	public Animal(String species, String foodType) {
		this.species = species;
		this.foodType = foodType;
	}
	
	public void displayAnimal() {
		System.out.println(this.foodType);
		System.out.println(this.species);
	}
	
	
	
	

}
