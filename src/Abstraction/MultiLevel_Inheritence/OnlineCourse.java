package Abstraction.MultiLevel_Inheritence;

class OnlineCourse extends Course{
	
	double PlatformCharge;
	
	public OnlineCourse(String name,double PlatformCharge) {
		super(name);
		this.PlatformCharge = PlatformCharge;
	}
	
	@Override
	void coursePrice() {
		super.CourseInfo();
		System.out.println("Platform Course: "+PlatformCharge);
	}
	
}
