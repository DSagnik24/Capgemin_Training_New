package Instances;

public class Child extends Parent {

	public void childMethod() {
		System.out.println("Child Method");
		
	}
public static void main(String[] args) {
		
		Parent p = new Child();
		p.parentMethod();
		
		
		Child  c = (Child)p;
		c.childMethod();
		c.parentMethod();
		
		Parent p2 = new Parent();
		
		if(p2 instanceof Child) {
			Child c3 = (Child)p2;
		}else {
			System.out.println("Upcasting is not done");
		}
		
		Child c2 = new Child();
		
		Parent p4 = c2;
		
		if(p4 instanceof Child) {
			Child c5 = (Child)p4;
			System.out.println("Downcasting done");
		}
	}

}
