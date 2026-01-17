package Association;

public class Car {
	 
	 private Engine engine;
	 private Tyre[] tyre;
	 
	 private String brand;
	 private double price;
	
	 Car(){
	 	 
	 	 engine = new Engine();
	 	tyre = new Tyre[4];
	 	for (int i = 0; i < tyre.length; i++) {
			tyre[i] = new Tyre();
		}
	 }
	 
	 public String getBrand() {
	 	 return brand;
	 }
	 
	 public double getPrice() {
	 	 return price;
	 }
	 
	 public Engine getEngine() {
	 	 return engine;
	 }
	 
	 public Tyre[] getTyre() {
	 	 return tyre;
	 }
}
