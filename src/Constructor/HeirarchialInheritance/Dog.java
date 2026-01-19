package Constructor.HeirarchialInheritance;

public class Dog extends Animal{
	String name;
	
	
	public Dog(String species, String foodType, String name) {
		super(species, foodType);
		this.name = name;
	}
	
	public void displayDog() {
		displayAnimal();
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Dog d = new Dog("Siberian Husky","Omnivore","Hulk");
		d.displayDog();
	}
	
}
