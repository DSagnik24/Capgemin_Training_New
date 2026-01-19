package Association;

public class Movie {
	private String name;
	private String language;
	private int duration;
	private String genre;
	
	public Movie(String name, String language, int duration, String genre) {
		this.name = name;
		this.language = language;
		this.duration = duration;
		this.genre = genre;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
