package JCF.TreeSets;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie>{


	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.rating<m2.rating) {
			return -1;
		}else if(m1.rating>m2.rating) {
			return 1;
		}
		return 0;
	}

}
