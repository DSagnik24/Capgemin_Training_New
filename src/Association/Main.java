package Association;

public class Main {
	 public static void main(String[] args) {

	        Movie m1 = new Movie("Inception", "English", 148, "Sci-Fi");
	        Movie m2 = new Movie("RRR", "Telugu", 182, "Action");

	        Movie[] movies = {m1, m2};

	        Subscription sub = new Subscription(499, "31-12-2026", 4);

	        Account acc = new Account("sagnik123", "pass@123", movies);

	        User user = new User(
	                "Sagnik",
	                "sagnik@gmail.com",
	                "10-05-2003",
	                sub,
	                acc
	        );

	        User[] users = {user};

	        Netflix netflix = new Netflix(users, movies);

	        // Example access using getters
	        System.out.println(netflix.getUsers()[0].getName());
	        System.out.println(netflix.getUsers()[0].getSubscription().getAmount());
	    }

}
