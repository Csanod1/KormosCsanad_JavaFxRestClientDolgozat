package hu.petrik.kormoscsanad_javafxrestclientdolgozat;

public class Anime {
    private int id;
    private String name;
    private int episodes;
    private int rating;
    private boolean watched;

    public Anime(int id, String name, int episodes, int rating, boolean watched) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
        this.rating = rating;
        this.watched = watched;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
