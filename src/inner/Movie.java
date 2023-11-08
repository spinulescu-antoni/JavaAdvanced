package inner;

public class Movie {
    private String title;
    private String directorName;
    private int yearOfRelease;
    private String genre;
    private String distribuitor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistribuitor() {
        return distribuitor;
    }

    public void setDistribuitor(String distribuitor) {
        this.distribuitor = distribuitor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", directorName='" + directorName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                ", distribuitor='" + distribuitor + '\'' +
                '}';
    }

    static class MovieBuilder {
        private String title;
        private String directorName;
        private int yearOfRelease;
        private String genre;
        private String distribuitor;

        public MovieBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder setDirectorName(String directorName) {
            this.directorName = directorName;
            return this;
        }

        public MovieBuilder setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieBuilder setDistribuitor(String distribuitor) {
            this.distribuitor = distribuitor;
            return this;
        }
        public Movie build(){
            Movie movie = new Movie();
            movie.title = this.title;
            movie.directorName = this.directorName;
            movie.yearOfRelease = this.yearOfRelease;
            movie.genre = this.genre;
            movie.distribuitor = this.distribuitor;
            return movie;
        }
    }

}
