package inner;

public class Main {
    public static void main(String[] args) {

        Movie.MovieBuilder builder1 = new Movie.MovieBuilder();
        Movie movie1 = builder1.setTitle("Batman")
                               .setDirectorName("Jhon Smith")
                               .setDistribuitor("Netflix")
                               .setGenre("Action")
                               .setYearOfRelease(2016)
                               .build();

        System.out.println(movie1);
        System.out.println();


        Movie movie2 = new Movie.MovieBuilder().setTitle("Spider-Man").setYearOfRelease(2020).setGenre("Action").build();
        System.out.println(movie2);
    }
}
