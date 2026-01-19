package Association;

public class Netflix {
	private User[]users;
	private Movie[]movies;
	
	public Netflix(User[] users, Movie[] movies) {
		super();
		this.users = users;
		this.movies = movies;
	}
	

    public User[] getUsers() {
        return users;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
	

}
