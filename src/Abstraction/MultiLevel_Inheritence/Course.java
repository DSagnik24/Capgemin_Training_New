package Abstraction.MultiLevel_Inheritence;

abstract class Course {
	String name;
	
	
	public Course(String name) {
		this.name = name;
	}

	void CourseInfo() {
		System.out.println("Course Name: "+ name);
	}
	
	abstract void coursePrice();

	abstract void courseFee();
}
