package JCF.Maps;

public class Person implements Comparable<Person> {
	int id;
	String name;
	int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public int compareTo(Person p) {
		return Integer.compare(p.id, this.id);
	}
	
}
