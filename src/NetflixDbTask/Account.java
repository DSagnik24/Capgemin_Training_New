package NetflixDbTask;

public class Account {
	private String userName;
	private String password;
	
	private Movies[]movies;
	
	public Account() {
		
	}

	public Account(String userName, String password, Movies[] movies) {
		super();
		this.userName = userName;
		this.password = password;
		this.movies = movies;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Movies[] getMovies() {
		return movies;
	}

	public void setMovies(Movies[] movies) {
		this.movies = movies;
	}
	
	

}
