package Interface_Practice;

public class TechLead extends Employee implements Coder, Manage{

	@Override
	public void manageTeam() {
		System.out.println("Techlead manages");
		
	}

	@Override
	public void WriteCode() {
		System.out.println("Techlead writes code");
		
	}

	@Override
	public void work() {
		System.out.println("Techlead works");
		
	}
	
	
}
