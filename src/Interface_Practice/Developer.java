package Interface_Practice;

public class Developer extends Employee implements Coder{
	public void work() {
		System.out.println("Dev is working");
	}

	@Override
	public void WriteCode() {
		System.out.println("Developer wrtie code");
	}
}
