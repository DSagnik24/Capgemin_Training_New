package Abstraction.MultiLevel_Inheritence;

public class Main {
	public static void main(String[] args) {
		Course c1 = new OnlinePaid("PW",5000,1000);
		
		c1.CourseInfo();
		c1.coursePrice();
		c1.courseFee();
	}
}
