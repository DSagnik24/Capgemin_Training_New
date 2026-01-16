package Association;

public class Car {
	
	 private Engine engine;
	
	 private String brand;
	 private double price;
	 
	 Car(){
		 engine = new Engine();
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
}
