package me.cam.songsincd;

public class Song {

    // Attributes each song will have
    private String artist;
    private String title;
    private int starRating = 0;

    // Construct the song
    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    /*
    Reports the song object and all it's attributes:

    You might have wanted me to reference the getter methods
    above but doing so in a non-static method in its own class
    is not only redundant but also bad practice.
     */
    public String toString() {
        return this.title + " by " + this.artist + " :: " + starRating + " stars.";
    }
}
