package JCF.TreeSets;

import java.util.TreeSet;

public class MovieDemo {
    public static void main(String[] args) {

        TreeSet<Movie> set = new TreeSet<>(new MovieComparator());

        set.add(new Movie(1, "Inception", 9.0));
        set.add(new Movie(2, "Interstellar", 8.8));
        set.add(new Movie(3, "Tenet", 7.5));

        for (Movie m : set) {
            System.out.println(m);
        }
    }
}
