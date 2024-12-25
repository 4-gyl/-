package Entity;

public class Movie {
    private String movieName;
    private String director;
    private String actors;
    private String releaseTime;

    public Movie(String movieName, String director, String actors, String releaseTime) {
        this.movieName = movieName;
        this.director = director;
        this.actors = actors;
        this.releaseTime = releaseTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }
}
