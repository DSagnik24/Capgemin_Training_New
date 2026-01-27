package Array_List;

import java.util.*;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student>list = new ArrayList<>();
		
		
		list.add(new Student(1, "S", 80.6));
		list.add(new Student(2, "A", 34.9));
		list.add(new Student(3, "G", 85.7));
		list.add(new Student(4, "N", 89.6));
		list.add(new Student(1, "S", 30.6));
		list.add(new Student(2, "A", 84.9));
		list.add(new Student(3, "G", 35.7));
		list.add(new Student(4, "N", 39.6));
		
		
		ArrayList<Student>list1 = new ArrayList<>(findLess(list));
		
		 Iterator<Student> itr = list1.iterator();
	        while (itr.hasNext()) {
	            Student s = itr.next();  
	            System.out.println(s);   
	        }
	}
	static ArrayList<Student>findLess(ArrayList<Student>list){
		ArrayList<Student>list1 = new ArrayList<>();
		
       Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			if(s.getPercentage()< 40){
				list1.add(s);
			}	
		}
		return list1;
	}
}
