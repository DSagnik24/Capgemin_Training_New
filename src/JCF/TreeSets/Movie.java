package JCF.TreeSets;

public class Movie {
	int id;
	String name;
	double rating;
	
	public Movie() {
		
	}
	
	public Movie(int id, String name, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	

}
