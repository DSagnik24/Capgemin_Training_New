package Association;

public class Account {
	private String userName;
	private String password;
	private Movie[] movie;
	
	public Account(String userName, String password, Movie[] movie) {
		super();
		this.userName = userName;
		this.password = password;
		this.movie = movie;
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

	public Movie[] getMovie() {
		return movie;
	}

	public void setMovie(Movie[] movie) {
		this.movie = movie;
	}
	
	
	

}
