package AdvanceJavaTasks;

public class ValidEmail {
	public static void main(String[] args) {
		String email = "sagnikduttaofficial18@gmail.com";
		
		System.out.println(isValid(email)?"Valid email":"InValid Email");
	}
	
	static boolean isValid(String email) {
		String regex = "^[a-zA-Z0-9._/]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
		return email.matches(regex);

	}
}
