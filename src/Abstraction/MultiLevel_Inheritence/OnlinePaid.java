package Abstraction.MultiLevel_Inheritence;

public class OnlinePaid extends OnlineCourse {

	double CourseFee;
	
	public OnlinePaid(String name, double PlatformCharge,double CourseFee) {
		super(name, PlatformCharge);
		this.CourseFee = CourseFee;
	}
	
	@Override
	void coursePrice() {
		System.out.println("The total Course price is: "+(PlatformCharge+CourseFee));
	}
	
	void courseFee() {
		
		System.out.println("The total Course price is: "+(CourseFee));
	}
	
	
}
