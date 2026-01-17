package Association;

public class Mobile {
	
	private Battery battery;
	
	private String brand;
	private double price;
	
	Mobile(){
		battery = new Battery();
	}
	
	public String getBrand() {
	 	 return brand;
	 }
	 
	 public double getPrice() {
	 	 return price;
	 }
	 
	 public Battery getBattery() {
		 return battery;
	 }
}
