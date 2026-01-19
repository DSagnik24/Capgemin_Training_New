package Constructor.HeirarchialInheritance;

public class Cow extends Animal{
	String name;
	
	public Cow(String species, String foodType, String name) {
		super(species, foodType);
		this.name = name;
	}
	public void displayCow() {
		displayAnimal();
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Cow c = new Cow("Bos taurus","Herbivore","Gauri");
		c.displayCow();
	}

}
