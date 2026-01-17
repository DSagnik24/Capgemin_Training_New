package NetflixDbTask;

public class Movies {
	private String name;
	private String language;
	private String duration;
	private String genre;
	
	public Movies() {
	}
	
	public Movies(String name, String language, String duration, String genre) {
		super();
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
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
