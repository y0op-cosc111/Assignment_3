package me.cam.songsincd;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: To objectify songs in programming
 * and deal with manipulation and analysis of
 * them and their components.
 */
public class TestSong {
    public static void main(String[] args) {

        // Initialize the songs and assign their ratings
        Song song1 = new Song("Lil keem", "Orange Soda");
        song1.setStarRating(5);
        Song song2 = new Song("DaBaby", "Toes");
        song2.setStarRating(3);
        Song song3 = new Song("Bock Hampton", "Face");
        song3.setStarRating(2);
        Song song4 = new Song("Don Toliver", "No idea");
        song4.setStarRating(4);
        Song song5 = new Song("Roddy Ricch", "The Box");
        song5.setStarRating(1);

        // Define the array and initialize it's values
        Song[] cd = {song1, song2, song3, song4, song5};

        // Loop through the songs and print them
        for (Song s : cd) {
            System.out.println(s.toString());
        }
    }
}