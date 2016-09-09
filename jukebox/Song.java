package jukebox;

/**
 *
 * @author STEPHEN HOEY SD 1 JAVA PROJECT 2013
 */
public class Song {

    private String artist;
    private String title;
    private double price;
    private double length;
    private int SongCount;

    public Song() {
        artist = "Korn";
        title = "Walking away from me";
        price = 9.99;
        length = 6.66;
        SongCount = 0;
    }

    public Song(String artist, String title, double price, double length) {
        this.artist = artist;
        this.title = title;
        this.price = price;
        this.length = length;
        this.SongCount = 0;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public int getCount() {
        return SongCount;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

    public void playSelectedSong() {
        this.SongCount++;
        System.out.println("Playing = " + title + ", by " + artist + ". You have played this song = " + SongCount + " times.");
    }

    public String toString() {
        String display = "Artist = " + getArtist() + ", Title = " + getTitle() + ", Price = " + getPrice() + ", Song Length = " + getLength() + ", number of plays: " + SongCount;
        return display;
    }
}
